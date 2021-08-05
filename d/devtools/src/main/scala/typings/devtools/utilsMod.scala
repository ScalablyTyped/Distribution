package typings.devtools

import typings.devtools.anon.ValueFunction
import typings.devtools.firefoxMod.Priorities
import typings.puppeteerCore.browserMod.Browser
import typings.puppeteerCore.frameManagerMod.Frame
import typings.puppeteerCore.jshandleMod.ElementHandle
import typings.puppeteerCore.pageMod.Page
import typings.std.Element
import typings.std.Error
import typings.std.Record
import typings.wdioLogger.mod.Logger
import typings.wdioProtocols.WDIOProtocols.CommandParameters
import typings.wdioProtocols.WDIOProtocols.CommandPathVariables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("devtools/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findByWhich(executables: js.Array[String], priorities: js.Array[Priorities]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findByWhich")(executables.asInstanceOf[js.Any], priorities.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def findElement(context: Frame, `using`: String, value: String): js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any) | Error
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(context.asInstanceOf[js.Any], `using`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any) | Error
  ]]
  inline def findElement(context: ElementHandle[Element], `using`: String, value: String): js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any) | Error
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(context.asInstanceOf[js.Any], `using`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any) | Error
  ]]
  inline def findElement(context: Page, `using`: String, value: String): js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any) | Error
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(context.asInstanceOf[js.Any], `using`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any) | Error
  ]]
  
  inline def findElements(context: Frame, `using`: String, value: String): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(context.asInstanceOf[js.Any], `using`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any
    ]
  ]]
  inline def findElements(context: ElementHandle[Element], `using`: String, value: String): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(context.asInstanceOf[js.Any], `using`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any
    ]
  ]]
  inline def findElements(context: Page, `using`: String, value: String): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(context.asInstanceOf[js.Any], `using`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ElementReference */ js.Any
    ]
  ]]
  
  inline def getPages(browser: Browser): js.Promise[js.Array[Page]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPages")(browser.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Page]]]
  inline def getPages(browser: Browser, retryInterval: Double): js.Promise[js.Array[Page]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPages")(browser.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Page]]]
  
  inline def getPrototype(commandWrapper: js.Function): Record[String, ValueFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(commandWrapper.asInstanceOf[js.Any]).asInstanceOf[Record[String, ValueFunction]]
  
  inline def getStaleElementError(elementId: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getStaleElementError")(elementId.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def patchDebug(scoppedLogger: Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("patchDebug")(scoppedLogger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sanitizeError(err: Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeError")(err.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def sort(installations: js.Array[String], priorities: js.Array[Priorities]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(installations.asInstanceOf[js.Any], priorities.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformExecuteArgs(): js.Promise[ElementHandle[Element] | js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformExecuteArgs")().asInstanceOf[js.Promise[ElementHandle[Element] | js.Any]]
  inline def transformExecuteArgs(args: js.Array[js.Any]): js.Promise[ElementHandle[Element] | js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformExecuteArgs")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementHandle[Element] | js.Any]]
  
  inline def transformExecuteResult(page: Page, result: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExecuteResult")(page.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def transformExecuteResult(page: Page, result: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExecuteResult")(page.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  inline def uniq(arr: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def validate(
    command: String,
    parameters: js.Array[CommandParameters],
    variables: js.Array[CommandPathVariables],
    ref: String,
    args: js.Array[js.Any]
  ): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(command.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
}
