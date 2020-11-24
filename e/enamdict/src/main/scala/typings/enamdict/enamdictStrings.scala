package typings.enamdict

import typings.enamdict.mod.NameType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enamdictStrings {
  
  @scala.inline
  def given: given = "given".asInstanceOf[given]
  
  @scala.inline
  def surname: surname = "surname".asInstanceOf[surname]
  
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait given extends NameType
  
  @js.native
  sealed trait surname extends NameType
  
  @js.native
  sealed trait unknown extends NameType
}
