package typings.googleCloudPubsub

import typings.googleCloudPromisify.mod.PromisifyOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@google-cloud/pubsub/build/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/pubsub/build/src/util", "Throttler")
  @js.native
  open class Throttler protected () extends StObject {
    def this(minMillis: Double) = this()
    
    /**
      * Performs the task requested, if enough time has passed since the
      * last successful call.
      */
    def doMaybe(task: js.Function): Unit = js.native
    
    var lastTime: js.UndefOr[Double] = js.native
    
    var minMillis: Double = js.native
  }
  
  inline def addToBucket[T, U](map: Map[T, js.Array[U]], bucket: T, item: U): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToBucket")(map.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def promisifySome[T](class_ : js.Function, classProto: T, methods: js.Array[/* keyof T */ String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifySome")(class_.asInstanceOf[js.Any], classProto.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def promisifySome[T](
    class_ : js.Function,
    classProto: T,
    methods: js.Array[/* keyof T */ String],
    options: PromisifyOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifySome")(class_.asInstanceOf[js.Any], classProto.asInstanceOf[js.Any], methods.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
