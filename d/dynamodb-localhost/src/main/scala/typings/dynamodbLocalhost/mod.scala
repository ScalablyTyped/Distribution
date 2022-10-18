package typings.dynamodbLocalhost

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dynamodb-localhost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[Unit]
  inline def install(callback: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def install(callback: js.Function0[Any], path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(callback.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def install(callback: Unit, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(callback.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[Unit]
  inline def remove(callback: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def restart(port: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")(port.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def start(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stop(port: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(port.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      * Enables CORS support (cross-origin resource sharing) for JavaScript.
      * Must be a comma-separated allowlist of specific domains, or an asterisk (which allows all access).
      * Default: "*"
      */
    var cors: js.UndefOr[String] = js.undefined
    
    /**
      * If not running in memory, the directory where DynamoDB local should write database files.
      * Note that you cannot specify both dbPath and inMemory at once.
      * For the path, current working directory is <projectroot>/node_modules/dynamodb-localhost/dynamodb.
      * For example to create <projectroot>/node_modules/dynamodb-localhost/dynamodb/<mypath> you should
      * specify '<mypath>/' with a forwardslash at the end.
      * Default: "."
      */
    var dbPath: js.UndefOr[String] = js.undefined
    
    /**
      * If true, will introduce delays for certain operations.
      * DynamoDB local can perform some tasks almost instantaneously, such as create/update/delete operations
      * on tables and indexes; however, the actual DynamoDB service requires more time for these tasks.
      * Setting this parameter helps DynamoDB local simulate the behavior of the real DynamoDB more closely.
      * (Currently, this parameter introduces delays only for global secondary indexes that are in either
      * CREATING or DELETING status.)
      */
    var delayTransientStatuses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, starts DynamoDB using docker, e.g.
      * docker run -d -p 8000:8000 amazon/dynamodb-local -jar DynamoDBLocal.jar -port 8000 -sharedDb -inMemory
      * The docker executable may be customized using process.env.DOCKER_PATH, and the docker image through
      * process.env.DOCKER_IMAGE.
      * Default: false
      */
    var docker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string which sets the initial heap size e.g., '2048m'. This is input to the java -Xms argument
      */
    var heapInitial: js.UndefOr[String] = js.undefined
    
    /**
      * A string which sets the maximum heap size e.g., '1g'. This is input to the java -Xmx argument
      */
    var heapMax: js.UndefOr[String] = js.undefined
    
    /**
      * Whether DynamoDB local should run in memory, instead of using a database file.
      * If true, when you stop DynamoDB local the data saved in it will be lost.
      * You cannot specify both dbPath and inMemory at once.
      */
    var inMemory: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If this and dbPath are true, optimizes the database tables before starting DynamoDB local.
      */
    var optimizeDbBeforeStartup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Port to listen on.
      * Default: 8000
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, DynamoDB local will use a single database file and all DynamoDB clients will interact
      * with the same set of tables regardless of their region and credential configuration.
      * If false, it will use separate files for each credential and region.
      */
    var sharedDb: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCors(value: String): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      inline def setDbPathUndefined: Self = StObject.set(x, "dbPath", js.undefined)
      
      inline def setDelayTransientStatuses(value: Boolean): Self = StObject.set(x, "delayTransientStatuses", value.asInstanceOf[js.Any])
      
      inline def setDelayTransientStatusesUndefined: Self = StObject.set(x, "delayTransientStatuses", js.undefined)
      
      inline def setDocker(value: Boolean): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
      
      inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
      
      inline def setHeapInitial(value: String): Self = StObject.set(x, "heapInitial", value.asInstanceOf[js.Any])
      
      inline def setHeapInitialUndefined: Self = StObject.set(x, "heapInitial", js.undefined)
      
      inline def setHeapMax(value: String): Self = StObject.set(x, "heapMax", value.asInstanceOf[js.Any])
      
      inline def setHeapMaxUndefined: Self = StObject.set(x, "heapMax", js.undefined)
      
      inline def setInMemory(value: Boolean): Self = StObject.set(x, "inMemory", value.asInstanceOf[js.Any])
      
      inline def setInMemoryUndefined: Self = StObject.set(x, "inMemory", js.undefined)
      
      inline def setOptimizeDbBeforeStartup(value: Boolean): Self = StObject.set(x, "optimizeDbBeforeStartup", value.asInstanceOf[js.Any])
      
      inline def setOptimizeDbBeforeStartupUndefined: Self = StObject.set(x, "optimizeDbBeforeStartup", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSharedDb(value: Boolean): Self = StObject.set(x, "sharedDb", value.asInstanceOf[js.Any])
      
      inline def setSharedDbUndefined: Self = StObject.set(x, "sharedDb", js.undefined)
    }
  }
}
