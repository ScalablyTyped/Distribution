package typings
package enhancedDashResolveLib.libResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @js.native
trait Resolver extends js.Object {
  var fileSystem: enhancedDashResolveLib.libCommonDashTypesMod.AbstractInputFileSystem = js.native
  def doResolve(
    `type`: java.lang.String,
    request: enhancedDashResolveLib.libCommonDashTypesMod.ResolverRequest,
    message: java.lang.String,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): js.Any = js.native
  def doResolve(
    `type`: java.lang.String,
    request: enhancedDashResolveLib.libCommonDashTypesMod.ResolverRequest,
    message: scala.Null,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): js.Any = js.native
  def isDirectory(path: java.lang.String): scala.Boolean = js.native
  def isModule(path: java.lang.String): scala.Boolean = js.native
  def join(path: java.lang.String, request: java.lang.String): java.lang.String = js.native
  def normalize(path: java.lang.String): java.lang.String = js.native
  def parse(identifier: java.lang.String): enhancedDashResolveLib.libCommonDashTypesMod.ResolveParseResult | scala.Null = js.native
  def resolve(
    context: enhancedDashResolveLib.libCommonDashTypesMod.ResolveContext,
    path: java.lang.String,
    request: java.lang.String,
    callback: enhancedDashResolveLib.libCommonDashTypesMod.LoggingCallbackWrapper
  ): js.Any = js.native
  def resolveSync(
    context: enhancedDashResolveLib.libCommonDashTypesMod.ResolveContext,
    path: java.lang.String,
    request: java.lang.String
  ): java.lang.String = js.native
}

