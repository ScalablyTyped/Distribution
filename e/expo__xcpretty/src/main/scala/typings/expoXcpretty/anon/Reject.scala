package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reject extends StObject {
  
  def reject(error: js.Error): Unit
  
  def resolve(buildOutput: String): Unit
  
  var xcodeProjectName: js.UndefOr[String] = js.undefined
}
object Reject {
  
  inline def apply(reject: js.Error => Unit, resolve: String => Unit): Reject = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Reject]
  }
  
  extension [Self <: Reject](x: Self) {
    
    inline def setReject(value: js.Error => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    inline def setResolve(value: String => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setXcodeProjectName(value: String): Self = StObject.set(x, "xcodeProjectName", value.asInstanceOf[js.Any])
    
    inline def setXcodeProjectNameUndefined: Self = StObject.set(x, "xcodeProjectName", js.undefined)
  }
}
