package typings.eventEmitter

import typings.eventEmitter.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unifyMod {
  
  inline def apply(emitter1: Emitter, emitter2: Emitter): Emitter = (^.asInstanceOf[js.Dynamic].apply(emitter1.asInstanceOf[js.Any], emitter2.asInstanceOf[js.Any])).asInstanceOf[Emitter]
  
  @JSImport("event-emitter/unify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
