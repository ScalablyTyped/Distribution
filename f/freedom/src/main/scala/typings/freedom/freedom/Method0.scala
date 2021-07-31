package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This generic interface represents any freedom method. Its purpose is to extend
// the basic definition to include the reckless call method, which does not
// produce a reply message.
@js.native
trait Method0[R] extends StObject {
  
  def apply(): js.Promise[R] = js.native
  
  def reckless(): Unit = js.native
}
