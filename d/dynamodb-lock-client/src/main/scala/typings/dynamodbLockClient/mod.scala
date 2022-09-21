package typings.dynamodbLockClient

import typings.awsSdk.mod.DynamoDB.DocumentClient
import typings.events.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dynamodb-lock-client", "FailClosed")
  @js.native
  open class FailClosed[PartitionTableKeyType /* <: String | Double */] protected () extends LockClient[PartitionTableKeyType] {
    def this(config: FailClosedConfig) = this()
  }
  
  @JSImport("dynamodb-lock-client", "FailOpen")
  @js.native
  open class FailOpen[PartitionTableKeyType /* <: String | Double */] protected () extends LockClient[PartitionTableKeyType] {
    def this(config: FailOpenConfig) = this()
  }
  
  @JSImport("dynamodb-lock-client", "LockClient")
  @js.native
  open class LockClient[PartitionTableKeyType /* <: String | Double */] () extends StObject {
    
    def acquireLock(id: PartitionTableKeyType, callback: js.Function2[/* error */ js.Error, /* lock */ Lock, Unit]): Unit = js.native
  }
  
  trait FailClosedConfig
    extends StObject
       with GenericConfig {
    
    var acquirePeriodMs: Double
  }
  object FailClosedConfig {
    
    inline def apply(acquirePeriodMs: Double, dynamodb: DocumentClient, lockTable: String, partitionKey: String): FailClosedConfig = {
      val __obj = js.Dynamic.literal(acquirePeriodMs = acquirePeriodMs.asInstanceOf[js.Any], dynamodb = dynamodb.asInstanceOf[js.Any], lockTable = lockTable.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailClosedConfig]
    }
    
    extension [Self <: FailClosedConfig](x: Self) {
      
      inline def setAcquirePeriodMs(value: Double): Self = StObject.set(x, "acquirePeriodMs", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailOpenConfig
    extends StObject
       with GenericConfig {
    
    var heartbeatPeriodMs: js.UndefOr[Double] = js.undefined
    
    var leaseDurationMs: Double
    
    var trustLocalTime: js.UndefOr[Boolean] = js.undefined
  }
  object FailOpenConfig {
    
    inline def apply(dynamodb: DocumentClient, leaseDurationMs: Double, lockTable: String, partitionKey: String): FailOpenConfig = {
      val __obj = js.Dynamic.literal(dynamodb = dynamodb.asInstanceOf[js.Any], leaseDurationMs = leaseDurationMs.asInstanceOf[js.Any], lockTable = lockTable.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailOpenConfig]
    }
    
    extension [Self <: FailOpenConfig](x: Self) {
      
      inline def setHeartbeatPeriodMs(value: Double): Self = StObject.set(x, "heartbeatPeriodMs", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatPeriodMsUndefined: Self = StObject.set(x, "heartbeatPeriodMs", js.undefined)
      
      inline def setLeaseDurationMs(value: Double): Self = StObject.set(x, "leaseDurationMs", value.asInstanceOf[js.Any])
      
      inline def setTrustLocalTime(value: Boolean): Self = StObject.set(x, "trustLocalTime", value.asInstanceOf[js.Any])
      
      inline def setTrustLocalTimeUndefined: Self = StObject.set(x, "trustLocalTime", js.undefined)
    }
  }
  
  trait GenericConfig extends StObject {
    
    var dynamodb: DocumentClient
    
    var lockTable: String
    
    var owner: js.UndefOr[String] = js.undefined
    
    var partitionKey: String
    
    var sortKey: js.UndefOr[String] = js.undefined
  }
  object GenericConfig {
    
    inline def apply(dynamodb: DocumentClient, lockTable: String, partitionKey: String): GenericConfig = {
      val __obj = js.Dynamic.literal(dynamodb = dynamodb.asInstanceOf[js.Any], lockTable = lockTable.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericConfig]
    }
    
    extension [Self <: GenericConfig](x: Self) {
      
      inline def setDynamodb(value: DocumentClient): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      inline def setLockTable(value: String): Self = StObject.set(x, "lockTable", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      inline def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    }
  }
  
  @js.native
  trait Lock extends EventEmitter {
    
    var fencingToken: Double = js.native
    
    def release(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  }
}
