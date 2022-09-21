package typings.dynamodb

import typings.dynamodb.callbackMod.Callback
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executeFilterMod {
  
  @js.native
  trait ExecuteFilter[T] extends StObject {
    
    def apply(): PromisedReadable[T] = js.native
    def apply(callback: Callback[T]): Unit = js.native
  }
  
  @js.native
  trait PromisedReadable[T] extends Readable {
    
    // DevNote: Promise function in dynamodb wraps results in an array
    def promise(): js.Promise[js.Array[T]] = js.native
  }
}
