package typings
package enhancedDashResolveLib.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/concord", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getExtensions(context: ConcordContext, configuration: Concord): js.Any = js.native
  def getField(context: ConcordContext, configuration: Concord, field: java.lang.String): js.Any = js.native
  def getMain(context: ConcordContext, configuration: Concord): js.Any = js.native
  def isConditionMatched(context: ConcordContext, condition: java.lang.String): scala.Boolean = js.native
  def isEnvironment(context: ConcordContext, env: Type): scala.Boolean = js.native
  def isEnvironment(context: ConcordContext, env: java.lang.String): scala.Boolean = js.native
  def isGlobMatched(glob: java.lang.String, relativePath: java.lang.String): scala.Boolean = js.native
  def isKeyMatched(context: ConcordContext, key: java.lang.String): java.lang.String | scala.Boolean = js.native
  def isResourceTypeSupported(context: ConcordContext, `type`: java.lang.String): scala.Boolean = js.native
  def isTypeMatched(baseType: Type, testedType: Type): scala.Boolean = js.native
  def isTypeMatched(baseType: Type, testedType: java.lang.String): scala.Boolean = js.native
  def isTypeMatched(baseType: java.lang.String, testedType: Type): scala.Boolean = js.native
  def isTypeMatched(baseType: java.lang.String, testedType: java.lang.String): scala.Boolean = js.native
  def matchModule(context: ConcordContext, configuration: Concord, request: java.lang.String): js.Any = js.native
  def matchType(context: ConcordContext, configuration: Concord, relativePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def parseType(`type`: java.lang.String): Type = js.native
}

