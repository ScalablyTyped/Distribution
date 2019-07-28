package typings.enhancedDashResolve.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/concord", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getExtensions(context: ConcordContext, configuration: Concord): js.Any = js.native
  def getField(context: ConcordContext, configuration: Concord, field: String): js.Any = js.native
  def getMain(context: ConcordContext, configuration: Concord): js.Any = js.native
  def isConditionMatched(context: ConcordContext, condition: String): Boolean = js.native
  def isEnvironment(context: ConcordContext, env: String): Boolean = js.native
  def isEnvironment(context: ConcordContext, env: Type): Boolean = js.native
  def isGlobMatched(glob: String, relativePath: String): Boolean = js.native
  def isKeyMatched(context: ConcordContext, key: String): String | Boolean = js.native
  def isResourceTypeSupported(context: ConcordContext, `type`: String): Boolean = js.native
  def isTypeMatched(baseType: String, testedType: String): Boolean = js.native
  def isTypeMatched(baseType: String, testedType: Type): Boolean = js.native
  def isTypeMatched(baseType: Type, testedType: String): Boolean = js.native
  def isTypeMatched(baseType: Type, testedType: Type): Boolean = js.native
  def matchModule(context: ConcordContext, configuration: Concord, request: String): js.Any = js.native
  def matchType(context: ConcordContext, configuration: Concord, relativePath: String): js.UndefOr[String] = js.native
  def parseType(`type`: String): Type = js.native
}

