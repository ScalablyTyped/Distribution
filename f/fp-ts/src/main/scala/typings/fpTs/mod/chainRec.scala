package typings.fpTs.mod

import typings.fpTs.eitherMod.Either_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainRec {
  
  @JSImport("fp-ts", "chainRec")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tailRec[A, B](a: A, f: js.Function1[/* a */ A, Either_[A, B]]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("tailRec")(a.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[B]
}
