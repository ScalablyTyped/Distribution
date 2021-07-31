package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuidOptions extends StObject {
  
  var version: js.Array[GuidVersions] | GuidVersions
}
object GuidOptions {
  
  @scala.inline
  def apply(version: js.Array[GuidVersions] | GuidVersions): GuidOptions = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuidOptions]
  }
  
  @scala.inline
  implicit class GuidOptionsMutableBuilder[Self <: GuidOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: js.Array[GuidVersions] | GuidVersions): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionVarargs(value: GuidVersions*): Self = StObject.set(x, "version", js.Array(value :_*))
  }
}
