package typings.firebaseMessaging

import typings.sinon.mod.SinonSpy
import typings.sinon.mod.SinonStub
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinonTypesMod {
  
  type Spy[T /* <: js.Function1[/* args */ js.Any, js.Any] */] = SinonSpy[Parameters[T], ReturnType[T]]
  
  type Stub[T /* <: js.Function1[/* args */ js.Any, js.Any] */] = SinonStub[Parameters[T], ReturnType[T]]
}
