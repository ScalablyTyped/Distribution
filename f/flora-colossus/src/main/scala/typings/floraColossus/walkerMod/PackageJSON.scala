package typings.floraColossus.walkerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageJSON extends js.Object {
  
  var dependencies: StringDictionary[VersionRange] = js.native
  
  var devDependencies: StringDictionary[VersionRange] = js.native
  
  var name: String = js.native
  
  var optionalDependencies: StringDictionary[VersionRange] = js.native
}
object PackageJSON {
  
  @scala.inline
  def apply(
    dependencies: StringDictionary[VersionRange],
    devDependencies: StringDictionary[VersionRange],
    name: String,
    optionalDependencies: StringDictionary[VersionRange]
  ): PackageJSON = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalDependencies = optionalDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJSON]
  }
  
  @scala.inline
  implicit class PackageJSONOps[Self <: PackageJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDependencies(value: StringDictionary[VersionRange]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevDependencies(value: StringDictionary[VersionRange]): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalDependencies(value: StringDictionary[VersionRange]): Self = this.set("optionalDependencies", value.asInstanceOf[js.Any])
  }
}
