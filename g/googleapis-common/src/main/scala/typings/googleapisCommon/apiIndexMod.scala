package typings.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.ServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiIndexMod {
  
  @JSImport("googleapis-common/build/src/apiIndex", "getAPI")
  @js.native
  def getAPI[T](api: String, options: String, versions: StringDictionary[js.Any]): T = js.native
  @JSImport("googleapis-common/build/src/apiIndex", "getAPI")
  @js.native
  def getAPI[T](api: String, options: String, versions: StringDictionary[js.Any], context: GoogleConfigurable): T = js.native
  @JSImport("googleapis-common/build/src/apiIndex", "getAPI")
  @js.native
  def getAPI[T](api: String, options: ServiceOptions, versions: StringDictionary[js.Any]): T = js.native
  @JSImport("googleapis-common/build/src/apiIndex", "getAPI")
  @js.native
  def getAPI[T](
    api: String,
    options: ServiceOptions,
    versions: StringDictionary[js.Any],
    context: GoogleConfigurable
  ): T = js.native
}
