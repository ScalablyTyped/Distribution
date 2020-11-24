package typings.ethersprojectProviders.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectProviders.formatterMod.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers", "Formatter")
@js.native
class Formatter ()
  extends typings.ethersprojectProviders.formatterMod.Formatter
/* static members */
@JSImport("@ethersproject/providers", "Formatter")
@js.native
object Formatter extends js.Object {
  
  def allowFalsish(format: FormatFunc, replaceValue: js.Any): FormatFunc = js.native
  
  def allowNull(format: FormatFunc): FormatFunc = js.native
  def allowNull(format: FormatFunc, nullValue: js.Any): FormatFunc = js.native
  
  def arrayOf(format: FormatFunc): FormatFunc = js.native
  
  def check(format: StringDictionary[FormatFunc], `object`: js.Any): js.Any = js.native
}
