package typings.googleCloudFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleCloudFirestore.FirebaseFirestore.AggregateField
import typings.googleCloudFirestore.FirebaseFirestore.FieldPath
import typings.googleCloudFirestore.FirebaseFirestore.SetOptions
import typings.googleCloudFirestore.typesV1beta1FirestoreClientMod.FirestoreClient
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clientemail extends StObject {
    
    var client_email: js.UndefOr[String] = js.undefined
    
    var private_key: js.UndefOr[String] = js.undefined
  }
  object Clientemail {
    
    inline def apply(): Clientemail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clientemail]
    }
    
    extension [Self <: Clientemail](x: Self) {
      
      inline def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      inline def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
    }
  }
  
  trait Count extends StObject {
    
    var count: AggregateField[Double]
  }
  object Count {
    
    inline def apply(count: AggregateField[Double]): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialOpsPerSecond extends StObject {
    
    var initialOpsPerSecond: js.UndefOr[Double] = js.undefined
    
    var maxOpsPerSecond: js.UndefOr[Double] = js.undefined
  }
  object InitialOpsPerSecond {
    
    inline def apply(): InitialOpsPerSecond = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialOpsPerSecond]
    }
    
    extension [Self <: InitialOpsPerSecond](x: Self) {
      
      inline def setInitialOpsPerSecond(value: Double): Self = StObject.set(x, "initialOpsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setInitialOpsPerSecondUndefined: Self = StObject.set(x, "initialOpsPerSecond", js.undefined)
      
      inline def setMaxOpsPerSecond(value: Double): Self = StObject.set(x, "maxOpsPerSecond", value.asInstanceOf[js.Any])
      
      inline def setMaxOpsPerSecondUndefined: Self = StObject.set(x, "maxOpsPerSecond", js.undefined)
    }
  }
  
  trait Merge
    extends StObject
       with SetOptions {
    
    val merge: js.UndefOr[Boolean] = js.undefined
  }
  object Merge {
    
    inline def apply(): Merge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Merge]
    }
    
    extension [Self <: Merge](x: Self) {
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    }
  }
  
  trait MergeFields
    extends StObject
       with SetOptions {
    
    val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
  }
  object MergeFields {
    
    inline def apply(): MergeFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeFields]
    }
    
    extension [Self <: MergeFields](x: Self) {
      
      inline def setMergeFields(value: js.Array[String | FieldPath]): Self = StObject.set(x, "mergeFields", value.asInstanceOf[js.Any])
      
      inline def setMergeFieldsUndefined: Self = StObject.set(x, "mergeFields", js.undefined)
      
      inline def setMergeFieldsVarargs(value: (String | FieldPath)*): Self = StObject.set(x, "mergeFields", js.Array(value*))
    }
  }
  
  @js.native
  trait TypeofFirestoreClient
    extends StObject
       with Instantiable0[FirestoreClient]
       with Instantiable1[/* opts */ ClientOptions, FirestoreClient] {
    
    /**
      * The DNS address for this API service - same as servicePath(),
      * exists for compatibility reasons.
      * @returns {string} The DNS address for this service.
      */
    def apiEndpoint: String = js.native
    
    /**
      * The port for this API service.
      * @returns {number} The default port for this service.
      */
    def port: Double = js.native
    
    /**
      * The scopes needed to make gRPC calls for every method defined
      * in this service.
      * @returns {string[]} List of default scopes.
      */
    def scopes: js.Array[String] = js.native
    
    /**
      * The DNS address for this API service.
      * @returns {string} The DNS address for this service.
      */
    def servicePath: String = js.native
  }
}
