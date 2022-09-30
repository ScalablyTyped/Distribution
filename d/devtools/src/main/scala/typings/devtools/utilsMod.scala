package typings.devtools

import typings.devtools.anon.ValueFunction
import typings.devtools.firefoxMod.Priorities
import typings.std.Record
import typings.wdioLogger.mod.Logger
import typings.wdioProtocols.typesMod.CommandParameters
import typings.wdioProtocols.typesMod.CommandPathVariables
import typings.wdioProtocols.typesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("devtools/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findByWhich(executables: js.Array[String], priorities: js.Array[Priorities]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findByWhich")(executables.asInstanceOf[js.Any], priorities.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def findElement(
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Frame */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle */ Any,
    `using`: String,
    value: String
  ): js.Promise[ElementReference | js.Error] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(context.asInstanceOf[js.Any], `using`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ElementReference | js.Error]]
  
  inline def findElements(
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Frame */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle */ Any,
    `using`: String,
    value: String
  ): js.Promise[js.Array[ElementReference]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(context.asInstanceOf[js.Any], `using`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ElementReference]]]
  
  inline def getPages(
    browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Browser */ Any
  ): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPages")(browser.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
    ]
  ]]
  inline def getPages(
    browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Browser */ Any,
    retryInterval: Double
  ): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPages")(browser.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
    ]
  ]]
  
  inline def getPrototype(commandWrapper: js.Function): Record[String, ValueFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(commandWrapper.asInstanceOf[js.Any]).asInstanceOf[Record[String, ValueFunction]]
  
  inline def getStaleElementError(elementId: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getStaleElementError")(elementId.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def patchDebug(scoppedLogger: Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("patchDebug")(scoppedLogger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def patchDebug(
    scoppedLogger: Logger,
    require: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequire */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patchDebug")(scoppedLogger.asInstanceOf[js.Any], require.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sanitizeError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def sleep(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")().asInstanceOf[js.Promise[Any]]
  inline def sleep(time: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def sort(installations: js.Array[String], priorities: js.Array[Priorities]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(installations.asInstanceOf[js.Any], priorities.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformExecuteArgs(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformExecuteArgs")().asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle */ Any
  ]]
  inline def transformExecuteArgs(args: js.Array[Any]): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformExecuteArgs")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle */ Any
  ]]
  
  inline def transformExecuteResult(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    result: js.Array[Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExecuteResult")(page.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def transformExecuteResult(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    result: Any
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExecuteResult")(page.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def uniq(arr: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def validate(
    command: String,
    parameters: js.Array[CommandParameters],
    variables: js.Array[CommandPathVariables],
    ref: String,
    args: js.Array[Any]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(command.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
}
