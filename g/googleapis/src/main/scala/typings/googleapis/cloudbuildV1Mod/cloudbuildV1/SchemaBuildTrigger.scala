package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for an automated build in response to source repository
  * changes.
  */
trait SchemaBuildTrigger extends StObject {
  
  /**
    * Contents of the build template.
    */
  var build: js.UndefOr[SchemaBuild] = js.undefined
  
  /**
    * Output only. Time when the trigger was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Human-readable description of this trigger.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the trigger will never result in a build.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Path, from the source root, to a file whose contents is used for the
    * template.
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * GitHubEventsConfig describes the configuration of a trigger that creates
    * a build whenever a GitHub event is received.
    */
  var github: js.UndefOr[SchemaGitHubEventsConfig] = js.undefined
  
  /**
    * Output only. Unique identifier of the trigger.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * ignored_files and included_files are file glob matches using
    * http://godoc/pkg/path/filepath#Match extended with support for
    * &quot;**&quot;.  If ignored_files and changed files are both empty, then
    * they are not used to determine whether or not to trigger a build.  If
    * ignored_files is not empty, then we ignore any files that match any of
    * the ignored_file globs. If the change has no files that are outside of
    * the ignored_files globs, then we do not trigger a build.
    */
  var ignoredFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If any of the files altered in the commit pass the ignored_files filter
    * and included_files is empty, then as far as this filter is concerned, we
    * should trigger the build.  If any of the files altered in the commit pass
    * the ignored_files filter and included_files is not empty, then we make
    * sure that at least one of those files matches a included_files glob. If
    * not, then we do not trigger a build.
    */
  var includedFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Substitutions data for Build resource.
    */
  var substitutions: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Template describing the types of source changes to trigger a build.
    * Branch and tag names in trigger templates are interpreted as regular
    * expressions. Any branch or tag change that matches that regular
    * expression will trigger a build.
    */
  var triggerTemplate: js.UndefOr[SchemaRepoSource] = js.undefined
}
object SchemaBuildTrigger {
  
  @scala.inline
  def apply(): SchemaBuildTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildTrigger]
  }
  
  @scala.inline
  implicit class SchemaBuildTriggerMutableBuilder[Self <: SchemaBuildTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: SchemaBuild): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setGithub(value: SchemaGitHubEventsConfig): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIgnoredFiles(value: js.Array[String]): Self = StObject.set(x, "ignoredFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredFilesUndefined: Self = StObject.set(x, "ignoredFiles", js.undefined)
    
    @scala.inline
    def setIgnoredFilesVarargs(value: String*): Self = StObject.set(x, "ignoredFiles", js.Array(value :_*))
    
    @scala.inline
    def setIncludedFiles(value: js.Array[String]): Self = StObject.set(x, "includedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedFilesUndefined: Self = StObject.set(x, "includedFiles", js.undefined)
    
    @scala.inline
    def setIncludedFilesVarargs(value: String*): Self = StObject.set(x, "includedFiles", js.Array(value :_*))
    
    @scala.inline
    def setSubstitutions(value: StringDictionary[String]): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "substitutions", js.undefined)
    
    @scala.inline
    def setTriggerTemplate(value: SchemaRepoSource): Self = StObject.set(x, "triggerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerTemplateUndefined: Self = StObject.set(x, "triggerTemplate", js.undefined)
  }
}
