package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBitbucketserverconfigsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The config resource name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsBitbucketserverconfigsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsBitbucketserverconfigsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBitbucketserverconfigsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBitbucketserverconfigsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
