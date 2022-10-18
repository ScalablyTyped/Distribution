package typings.ecmarkup

import typings.ecmarkup.ecmarkupStrings.`inline`
import typings.ecmarkup.ecmarkupStrings.draft
import typings.ecmarkup.ecmarkupStrings.external
import typings.ecmarkup.ecmarkupStrings.none
import typings.ecmarkup.ecmarkupStrings.proposal
import typings.ecmarkup.ecmarkupStrings.standard
import typings.ecmarkup.libBiblioMod.ExportedBiblio
import typings.ecmarkup.libSpecMod.Spec
import typings.prex.mod.CancellationToken
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecmarkup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecmarkup", "Boilerplate")
  @js.native
  open class Boilerplate () extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var copyright: js.UndefOr[String] = js.native
    
    var license: js.UndefOr[String] = js.native
  }
  
  inline def build(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, PromiseLike[String]]
  ): js.Promise[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(path.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Spec]]
  inline def build(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, PromiseLike[String]],
    opts: Unit,
    token: CancellationToken
  ): js.Promise[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(path.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Spec]]
  inline def build(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, PromiseLike[String]],
    opts: Options
  ): js.Promise[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(path.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Spec]]
  inline def build(
    path: String,
    fetch: js.Function2[/* path */ String, /* token */ CancellationToken, PromiseLike[String]],
    opts: Options,
    token: CancellationToken
  ): js.Promise[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(path.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Spec]]
  
  trait EcmarkupError extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var message: String
    
    var nodeType: js.UndefOr[String] = js.undefined
    
    var ruleId: String
    
    var source: js.UndefOr[String] = js.undefined
  }
  object EcmarkupError {
    
    inline def apply(message: String, ruleId: String): EcmarkupError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EcmarkupError]
    }
    
    extension [Self <: EcmarkupError](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var assets: js.UndefOr[none | `inline` | external] = js.undefined
    
    var boilerplate: js.UndefOr[Boilerplate] = js.undefined
    
    var contributors: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[Boolean] = js.undefined
    
    var cssOut: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var extraBiblios: js.UndefOr[js.Array[ExportedBiblio]] = js.undefined
    
    var jsOut: js.UndefOr[String] = js.undefined
    
    var lintSpec: js.UndefOr[Boolean] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var markEffects: js.UndefOr[Boolean] = js.undefined
    
    var multipage: js.UndefOr[Boolean] = js.undefined
    
    var oldToc: js.UndefOr[Boolean] = js.undefined
    
    var outfile: js.UndefOr[String] = js.undefined
    
    var shortname: js.UndefOr[String] = js.undefined
    
    var stage: js.UndefOr[String | Null] = js.undefined
    
    var status: js.UndefOr[proposal | draft | standard] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var toc: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var warn: js.UndefOr[js.Function1[/* err */ EcmarkupError, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAssets(value: none | `inline` | external): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
      
      inline def setBoilerplate(value: Boilerplate): Self = StObject.set(x, "boilerplate", value.asInstanceOf[js.Any])
      
      inline def setBoilerplateUndefined: Self = StObject.set(x, "boilerplate", js.undefined)
      
      inline def setContributors(value: String): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      inline def setCopyright(value: Boolean): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setCssOut(value: String): Self = StObject.set(x, "cssOut", value.asInstanceOf[js.Any])
      
      inline def setCssOutUndefined: Self = StObject.set(x, "cssOut", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setExtraBiblios(value: js.Array[ExportedBiblio]): Self = StObject.set(x, "extraBiblios", value.asInstanceOf[js.Any])
      
      inline def setExtraBibliosUndefined: Self = StObject.set(x, "extraBiblios", js.undefined)
      
      inline def setExtraBibliosVarargs(value: ExportedBiblio*): Self = StObject.set(x, "extraBiblios", js.Array(value*))
      
      inline def setJsOut(value: String): Self = StObject.set(x, "jsOut", value.asInstanceOf[js.Any])
      
      inline def setJsOutUndefined: Self = StObject.set(x, "jsOut", js.undefined)
      
      inline def setLintSpec(value: Boolean): Self = StObject.set(x, "lintSpec", value.asInstanceOf[js.Any])
      
      inline def setLintSpecUndefined: Self = StObject.set(x, "lintSpec", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setLog(value: /* msg */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMarkEffects(value: Boolean): Self = StObject.set(x, "markEffects", value.asInstanceOf[js.Any])
      
      inline def setMarkEffectsUndefined: Self = StObject.set(x, "markEffects", js.undefined)
      
      inline def setMultipage(value: Boolean): Self = StObject.set(x, "multipage", value.asInstanceOf[js.Any])
      
      inline def setMultipageUndefined: Self = StObject.set(x, "multipage", js.undefined)
      
      inline def setOldToc(value: Boolean): Self = StObject.set(x, "oldToc", value.asInstanceOf[js.Any])
      
      inline def setOldTocUndefined: Self = StObject.set(x, "oldToc", js.undefined)
      
      inline def setOutfile(value: String): Self = StObject.set(x, "outfile", value.asInstanceOf[js.Any])
      
      inline def setOutfileUndefined: Self = StObject.set(x, "outfile", js.undefined)
      
      inline def setShortname(value: String): Self = StObject.set(x, "shortname", value.asInstanceOf[js.Any])
      
      inline def setShortnameUndefined: Self = StObject.set(x, "shortname", js.undefined)
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageNull: Self = StObject.set(x, "stage", null)
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      inline def setStatus(value: proposal | draft | standard): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToc(value: Boolean): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
      
      inline def setTocUndefined: Self = StObject.set(x, "toc", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWarn(value: /* err */ EcmarkupError => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
