package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes SourceRepository, used to represent parameters related to source
  * repository where a function is hosted.
  */
@js.native
trait SchemaSourceRepository extends StObject {
  
  /**
    * Output only. The URL pointing to the hosted repository where the function
    * were defined at the time of deployment. It always points to a specific
    * commit in the format described above.
    */
  var deployedUrl: js.UndefOr[String] = js.native
  
  /**
    * The URL pointing to the hosted repository where the function is defined.
    * There are supported Cloud Source Repository URLs in the following
    * formats:  To refer to a specific commit:
    * `https://source.developers.google.com/projects/x/repos/x/revisions/x/paths/x
    * To refer to a moveable alias (branch):
    * `https://source.developers.google.com/projects/x/repos/x/moveable-aliases/x/paths/x
    * In particular, to refer to HEAD use `master` moveable alias. To refer to
    * a specific fixed alias (tag):
    * `https://source.developers.google.com/projects/x/repos/x/fixed-aliases/x/paths/x
    * You may omit `paths/x if you want to use the main directory.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaSourceRepository {
  
  @scala.inline
  def apply(): SchemaSourceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceRepository]
  }
  
  @scala.inline
  implicit class SchemaSourceRepositoryMutableBuilder[Self <: SchemaSourceRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployedUrl(value: String): Self = StObject.set(x, "deployedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedUrlUndefined: Self = StObject.set(x, "deployedUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
