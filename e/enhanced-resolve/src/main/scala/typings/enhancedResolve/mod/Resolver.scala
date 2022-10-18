package typings.enhancedResolve.mod

import typings.enhancedResolve.anon.NoResolve
import typings.enhancedResolve.enhancedResolveBooleans.`false`
import typings.tapable.mod.AsyncSeriesBailHook
import typings.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("enhanced-resolve", "Resolver")
@js.native
open class Resolver () extends StObject {
  
  def doResolve(): Any = js.native
  def doResolve(hook: Any): Any = js.native
  def doResolve(hook: Any, request: Any): Any = js.native
  def doResolve(hook: Any, request: Any, message: Any): Any = js.native
  def doResolve(hook: Any, request: Any, message: Any, resolveContext: Any): Any = js.native
  def doResolve(hook: Any, request: Any, message: Any, resolveContext: Any, callback: Any): Any = js.native
  def doResolve(hook: Any, request: Any, message: Any, resolveContext: Unit, callback: Any): Any = js.native
  def doResolve(hook: Any, request: Any, message: Unit, resolveContext: Any): Any = js.native
  def doResolve(hook: Any, request: Any, message: Unit, resolveContext: Any, callback: Any): Any = js.native
  def doResolve(hook: Any, request: Any, message: Unit, resolveContext: Unit, callback: Any): Any = js.native
  def doResolve(hook: Any, request: Unit, message: Any): Any = js.native
  def doResolve(hook: Any, request: Unit, message: Any, resolveContext: Any): Any = js.native
  def doResolve(hook: Any, request: Unit, message: Any, resolveContext: Any, callback: Any): Any = js.native
  def doResolve(hook: Any, request: Unit, message: Any, resolveContext: Unit, callback: Any): Any = js.native
  def doResolve(hook: Any, request: Unit, message: Unit, resolveContext: Any): Any = js.native
  def doResolve(hook: Any, request: Unit, message: Unit, resolveContext: Any, callback: Any): Any = js.native
  def doResolve(hook: Any, request: Unit, message: Unit, resolveContext: Unit, callback: Any): Any = js.native
  def doResolve(hook: Unit, request: Any): Any = js.native
  def doResolve(hook: Unit, request: Any, message: Any): Any = js.native
  def doResolve(hook: Unit, request: Any, message: Any, resolveContext: Any): Any = js.native
  def doResolve(hook: Unit, request: Any, message: Any, resolveContext: Any, callback: Any): Any = js.native
  def doResolve(hook: Unit, request: Any, message: Any, resolveContext: Unit, callback: Any): Any = js.native
  def doResolve(hook: Unit, request: Any, message: Unit, resolveContext: Any): Any = js.native
  def doResolve(hook: Unit, request: Any, message: Unit, resolveContext: Any, callback: Any): Any = js.native
  def doResolve(hook: Unit, request: Any, message: Unit, resolveContext: Unit, callback: Any): Any = js.native
  def doResolve(hook: Unit, request: Unit, message: Any): Any = js.native
  def doResolve(hook: Unit, request: Unit, message: Any, resolveContext: Any): Any = js.native
  def doResolve(hook: Unit, request: Unit, message: Any, resolveContext: Any, callback: Any): Any = js.native
  def doResolve(hook: Unit, request: Unit, message: Any, resolveContext: Unit, callback: Any): Any = js.native
  def doResolve(hook: Unit, request: Unit, message: Unit, resolveContext: Any): Any = js.native
  def doResolve(hook: Unit, request: Unit, message: Unit, resolveContext: Any, callback: Any): Any = js.native
  def doResolve(hook: Unit, request: Unit, message: Unit, resolveContext: Unit, callback: Any): Any = js.native
  
  def ensureHook(name: String): AsyncSeriesBailHook[
    js.Tuple2[ResolveRequest, ResolveContext], 
    Null | ResolveRequest, 
    UnsetAdditionalOptions
  ] = js.native
  def ensureHook(
    name: AsyncSeriesBailHook[
      js.Tuple2[ResolveRequest, ResolveContext], 
      Null | ResolveRequest, 
      UnsetAdditionalOptions
    ]
  ): AsyncSeriesBailHook[
    js.Tuple2[ResolveRequest, ResolveContext], 
    Null | ResolveRequest, 
    UnsetAdditionalOptions
  ] = js.native
  
  var fileSystem: typings.std.FileSystem = js.native
  
  def getHook(name: String): AsyncSeriesBailHook[
    js.Tuple2[ResolveRequest, ResolveContext], 
    Null | ResolveRequest, 
    UnsetAdditionalOptions
  ] = js.native
  def getHook(
    name: AsyncSeriesBailHook[
      js.Tuple2[ResolveRequest, ResolveContext], 
      Null | ResolveRequest, 
      UnsetAdditionalOptions
    ]
  ): AsyncSeriesBailHook[
    js.Tuple2[ResolveRequest, ResolveContext], 
    Null | ResolveRequest, 
    UnsetAdditionalOptions
  ] = js.native
  
  var hooks: NoResolve = js.native
  
  def isDirectory(path: String): Boolean = js.native
  
  def isModule(): Boolean = js.native
  def isModule(path: Any): Boolean = js.native
  
  def isPrivate(): Boolean = js.native
  def isPrivate(path: Any): Boolean = js.native
  
  def join(): String = js.native
  def join(path: Any): String = js.native
  def join(path: Any, request: Any): String = js.native
  def join(path: Unit, request: Any): String = js.native
  
  def normalize(): String = js.native
  def normalize(path: Any): String = js.native
  
  var options: UserResolveOptions = js.native
  
  def parse(identifier: String): ParsedIdentifier = js.native
  
  def resolveSync(context: js.Object, path: String, request: String): String | `false` = js.native
  
  @JSName("resolve")
  def resolve_false(
    context: js.Object,
    path: String,
    request: String,
    resolveContext: ResolveContext,
    callback: js.Function3[
      /* arg0 */ Null | js.Error, 
      /* arg1 */ js.UndefOr[String | `false`], 
      /* arg2 */ js.UndefOr[ResolveRequest], 
      Unit
    ]
  ): Unit = js.native
}
