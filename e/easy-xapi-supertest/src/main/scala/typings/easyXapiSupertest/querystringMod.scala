package typings.easyXapiSupertest

import typings.easyXapiSupertest.anon.MaxKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("querystring", JSImport.Namespace)
@js.native
object querystringMod extends js.Object {
  
  def escape(str: String): String = js.native
  
  def parse(str: String): js.Any = js.native
  def parse(str: String, sep: js.UndefOr[scala.Nothing], eq: js.UndefOr[scala.Nothing], options: MaxKeys): js.Any = js.native
  def parse(str: String, sep: js.UndefOr[scala.Nothing], eq: String): js.Any = js.native
  def parse(str: String, sep: js.UndefOr[scala.Nothing], eq: String, options: MaxKeys): js.Any = js.native
  def parse(str: String, sep: String): js.Any = js.native
  def parse(str: String, sep: String, eq: js.UndefOr[scala.Nothing], options: MaxKeys): js.Any = js.native
  def parse(str: String, sep: String, eq: String): js.Any = js.native
  def parse(str: String, sep: String, eq: String, options: MaxKeys): js.Any = js.native
  
  def stringify(obj: js.Any): String = js.native
  def stringify(obj: js.Any, sep: js.UndefOr[scala.Nothing], eq: String): String = js.native
  def stringify(obj: js.Any, sep: String): String = js.native
  def stringify(obj: js.Any, sep: String, eq: String): String = js.native
  
  def unescape(str: String): String = js.native
}
