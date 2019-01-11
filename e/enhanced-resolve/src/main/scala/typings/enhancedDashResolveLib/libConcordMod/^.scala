package typings
package enhancedDashResolveLib.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/concord", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getExtensions(
    context: enhancedDashResolveLib.libConcordMod.ConcordContext,
    configuration: enhancedDashResolveLib.libConcordMod.Concord
  ): js.Any = js.native
  def getField(
    context: enhancedDashResolveLib.libConcordMod.ConcordContext,
    configuration: enhancedDashResolveLib.libConcordMod.Concord,
    field: java.lang.String
  ): js.Any = js.native
  def getMain(
    context: enhancedDashResolveLib.libConcordMod.ConcordContext,
    configuration: enhancedDashResolveLib.libConcordMod.Concord
  ): js.Any = js.native
  def isConditionMatched(context: enhancedDashResolveLib.libConcordMod.ConcordContext, condition: java.lang.String): scala.Boolean = js.native
  def isEnvironment(
    context: enhancedDashResolveLib.libConcordMod.ConcordContext,
    env: enhancedDashResolveLib.libConcordMod.Type
  ): scala.Boolean = js.native
  def isEnvironment(context: enhancedDashResolveLib.libConcordMod.ConcordContext, env: java.lang.String): scala.Boolean = js.native
  def isGlobMatched(glob: java.lang.String, relativePath: java.lang.String): scala.Boolean = js.native
  def isKeyMatched(context: enhancedDashResolveLib.libConcordMod.ConcordContext, key: java.lang.String): java.lang.String | scala.Boolean = js.native
  def isResourceTypeSupported(context: enhancedDashResolveLib.libConcordMod.ConcordContext, `type`: java.lang.String): scala.Boolean = js.native
  def isTypeMatched(
    baseType: enhancedDashResolveLib.libConcordMod.Type,
    testedType: enhancedDashResolveLib.libConcordMod.Type
  ): scala.Boolean = js.native
  def isTypeMatched(baseType: enhancedDashResolveLib.libConcordMod.Type, testedType: java.lang.String): scala.Boolean = js.native
  def isTypeMatched(baseType: java.lang.String, testedType: enhancedDashResolveLib.libConcordMod.Type): scala.Boolean = js.native
  def isTypeMatched(baseType: java.lang.String, testedType: java.lang.String): scala.Boolean = js.native
  def matchModule(
    context: enhancedDashResolveLib.libConcordMod.ConcordContext,
    configuration: enhancedDashResolveLib.libConcordMod.Concord,
    request: java.lang.String
  ): js.Any = js.native
  def matchType(
    context: enhancedDashResolveLib.libConcordMod.ConcordContext,
    configuration: enhancedDashResolveLib.libConcordMod.Concord,
    relativePath: java.lang.String
  ): js.UndefOr[java.lang.String] = js.native
  def parseType(`type`: java.lang.String): enhancedDashResolveLib.libConcordMod.Type = js.native
}

