package typings.expectJs

import typings.expectJs.Expect.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @scala.inline
  def expect(): Root = js.Dynamic.global.applyDynamic("expect")().asInstanceOf[Root]
  @scala.inline
  def expect(target: js.Any): Root = js.Dynamic.global.applyDynamic("expect")(target.asInstanceOf[js.Any]).asInstanceOf[Root]
}
