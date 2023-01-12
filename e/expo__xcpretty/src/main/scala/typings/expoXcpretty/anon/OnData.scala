package typings.expoXcpretty.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnData extends StObject {
  
  def onData(data: Buffer): Unit
  
  def onEnd(code: Double): Unit
  
  def onErr(data: Buffer): Unit
}
object OnData {
  
  inline def apply(onData: Buffer => Unit, onEnd: Double => Unit, onErr: Buffer => Unit): OnData = {
    val __obj = js.Dynamic.literal(onData = js.Any.fromFunction1(onData), onEnd = js.Any.fromFunction1(onEnd), onErr = js.Any.fromFunction1(onErr))
    __obj.asInstanceOf[OnData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnData] (val x: Self) extends AnyVal {
    
    inline def setOnData(value: Buffer => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
    
    inline def setOnEnd(value: Double => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
    
    inline def setOnErr(value: Buffer => Unit): Self = StObject.set(x, "onErr", js.Any.fromFunction1(value))
  }
}
