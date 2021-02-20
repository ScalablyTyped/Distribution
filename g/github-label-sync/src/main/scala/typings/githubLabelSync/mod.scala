package typings.githubLabelSync

import typings.githubLabelSync.anon.Diff
import typings.githubLabelSync.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("github-label-sync", JSImport.Default)
  @js.native
  def default(options: Options): js.Promise[js.Array[LabelDiff]] = js.native
  
  @JSImport("github-label-sync", "defaults")
  @js.native
  val defaults: DefaultOptions = js.native
  
  @js.native
  trait BasicLabel extends StObject {
    
    var color: String = js.native
    
    var name: String = js.native
  }
  object BasicLabel {
    
    @scala.inline
    def apply(color: String, name: String): BasicLabel = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicLabel]
    }
    
    @scala.inline
    implicit class BasicLabelMutableBuilder[Self <: BasicLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Required<github-label-sync.github-label-sync.OptionsBase> */
  @js.native
  trait DefaultOptions extends StObject {
    
    var accessToken: Null = js.native
    
    var allowAddedLabels: Boolean = js.native
    
    var dryRun: Boolean = js.native
    
    var endpoint: Null = js.native
    
    var format: Diff = js.native
    
    var labels: js.Array[LabelInfo] = js.native
    
    var log: Info = js.native
    
    var repo: Null = js.native
  }
  object DefaultOptions {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DefaultOptionsMutableBuilder[Self <: DefaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: Null): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAddedLabels(value: Boolean): Self = StObject.set(x, "allowAddedLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: Null): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: Diff): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabels(value: js.Array[LabelInfo]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsVarargs(value: LabelInfo*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setLog(value: Info): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepo(value: Null): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LabelDiff extends StObject {
    
    var actual: js.UndefOr[BasicLabel] = js.native
    
    var expected: js.UndefOr[BasicLabel] = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object LabelDiff {
    
    @scala.inline
    def apply(name: String, `type`: String): LabelDiff = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelDiff]
    }
    
    @scala.inline
    implicit class LabelDiffMutableBuilder[Self <: LabelDiff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: BasicLabel): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      @scala.inline
      def setExpected(value: BasicLabel): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LabelInfo extends BasicLabel {
    
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    var description: js.UndefOr[String] = js.native
  }
  object LabelInfo {
    
    @scala.inline
    def apply(color: String, name: String): LabelInfo = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelInfo]
    }
    
    @scala.inline
    implicit class LabelInfoMutableBuilder[Self <: LabelInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  @js.native
  trait Options extends OptionsBase {
    
    var accessToken: String = js.native
    
    var endpoint: js.UndefOr[String] = js.native
    
    var repo: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(accessToken: String, labels: js.Array[LabelInfo], repo: String): Options = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionsBase extends StObject {
    
    var allowAddedLabels: js.UndefOr[Boolean] = js.native
    
    var dryRun: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[Diff] = js.native
    
    var labels: js.Array[LabelInfo] = js.native
    
    var log: js.UndefOr[Info] = js.native
  }
  object OptionsBase {
    
    @scala.inline
    def apply(labels: js.Array[LabelInfo]): OptionsBase = {
      val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsBase]
    }
    
    @scala.inline
    implicit class OptionsBaseMutableBuilder[Self <: OptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAddedLabels(value: Boolean): Self = StObject.set(x, "allowAddedLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAddedLabelsUndefined: Self = StObject.set(x, "allowAddedLabels", js.undefined)
      
      @scala.inline
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      @scala.inline
      def setFormat(value: Diff): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Array[LabelInfo]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsVarargs(value: LabelInfo*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setLog(value: Info): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
}
