package typings.dirCompare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("dir-compare/build/src/FileSystem/Queue", "Queue")
  @js.native
  open class Queue[T] () extends StObject {
    
    def dequeue(): js.UndefOr[T] = js.native
    
    def enqueue(item: T): Unit = js.native
    
    def getLength(): Double = js.native
    
    /* private */ var offset: Any = js.native
    
    /* private */ var queue: Any = js.native
  }
}
