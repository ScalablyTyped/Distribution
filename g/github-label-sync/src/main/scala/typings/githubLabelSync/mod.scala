package typings.githubLabelSync

import typings.githubLabelSync.anon.Diff
import typings.githubLabelSync.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("github-label-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): js.Promise[js.Array[LabelDiff]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LabelDiff]]]
  
  @JSImport("github-label-sync", "defaults")
  @js.native
  val defaults: DefaultOptions = js.native
  
  trait BasicLabel extends StObject {
    
    var color: String
    
    var name: String
  }
  object BasicLabel {
    
    inline def apply(color: String, name: String): BasicLabel = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicLabel]
    }
    
    extension [Self <: BasicLabel](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Required<github-label-sync.github-label-sync.OptionsBase> */
  trait DefaultOptions extends StObject {
    
    var accessToken: Null
    
    var allowAddedLabels: Boolean
    
    var dryRun: Boolean
    
    var endpoint: Null
    
    var format: Diff
    
    var labels: js.Array[LabelInfo]
    
    var log: Info
    
    var repo: Null
  }
  object DefaultOptions {
    
    inline def apply(
      accessToken: Null,
      allowAddedLabels: Boolean,
      dryRun: Boolean,
      endpoint: Null,
      format: Diff,
      labels: js.Array[LabelInfo],
      log: Info,
      repo: Null
    ): DefaultOptions = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], allowAddedLabels = allowAddedLabels.asInstanceOf[js.Any], dryRun = dryRun.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptions]
    }
    
    extension [Self <: DefaultOptions](x: Self) {
      
      inline def setAccessToken(value: Null): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAllowAddedLabels(value: Boolean): Self = StObject.set(x, "allowAddedLabels", value.asInstanceOf[js.Any])
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: Null): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Diff): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Array[LabelInfo]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: LabelInfo*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      inline def setLog(value: Info): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setRepo(value: Null): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelDiff extends StObject {
    
    var actual: js.UndefOr[BasicLabel] = js.undefined
    
    var expected: js.UndefOr[BasicLabel] = js.undefined
    
    var name: String
    
    var `type`: String
  }
  object LabelDiff {
    
    inline def apply(name: String, `type`: String): LabelDiff = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelDiff]
    }
    
    extension [Self <: LabelDiff](x: Self) {
      
      inline def setActual(value: BasicLabel): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setExpected(value: BasicLabel): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelInfo
    extends StObject
       with BasicLabel {
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
  }
  object LabelInfo {
    
    inline def apply(color: String, name: String): LabelInfo = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelInfo]
    }
    
    extension [Self <: LabelInfo](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with OptionsBase {
    
    var accessToken: String
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var repo: String
  }
  object Options {
    
    inline def apply(accessToken: String, labels: js.Array[LabelInfo], repo: String): Options = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsBase extends StObject {
    
    var allowAddedLabels: js.UndefOr[Boolean] = js.undefined
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Diff] = js.undefined
    
    var labels: js.Array[LabelInfo]
    
    var log: js.UndefOr[Info] = js.undefined
  }
  object OptionsBase {
    
    inline def apply(labels: js.Array[LabelInfo]): OptionsBase = {
      val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsBase]
    }
    
    extension [Self <: OptionsBase](x: Self) {
      
      inline def setAllowAddedLabels(value: Boolean): Self = StObject.set(x, "allowAddedLabels", value.asInstanceOf[js.Any])
      
      inline def setAllowAddedLabelsUndefined: Self = StObject.set(x, "allowAddedLabels", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setFormat(value: Diff): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLabels(value: js.Array[LabelInfo]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: LabelInfo*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      inline def setLog(value: Info): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
}
