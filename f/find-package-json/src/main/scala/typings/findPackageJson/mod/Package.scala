package typings.findPackageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.findPackageJson.anon.Email
import typings.findPackageJson.anon.Type
import typings.findPackageJson.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Package
  extends /* k */ StringDictionary[js.Any] {
  
  var author: js.UndefOr[Person] = js.native
  
  var bin: js.UndefOr[StringDictionary[String]] = js.native
  
  var bugs: js.UndefOr[Email | Url] = js.native
  
  var bundleDependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  var contributors: js.UndefOr[js.Array[Person]] = js.native
  
  var dependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var devDependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  var engines: js.UndefOr[StringDictionary[String]] = js.native
  
  var files: js.UndefOr[js.Array[String]] = js.native
  
  var homepage: js.UndefOr[String] = js.native
  
  var keywords: js.UndefOr[js.Array[String]] = js.native
  
  var license: js.UndefOr[String] = js.native
  
  var maintainers: js.UndefOr[js.Array[Person]] = js.native
  
  var man: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var optionalDependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  var readme: js.UndefOr[String] = js.native
  
  var repository: js.UndefOr[Type] = js.native
  
  var scripts: js.UndefOr[StringDictionary[String]] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object Package {
  
  @scala.inline
  def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: Person): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setBin(value: StringDictionary[String]): Self = this.set("bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBin: Self = this.set("bin", js.undefined)
    
    @scala.inline
    def setBugs(value: Email | Url): Self = this.set("bugs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBugs: Self = this.set("bugs", js.undefined)
    
    @scala.inline
    def setBundleDependencies(value: StringDictionary[String]): Self = this.set("bundleDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleDependencies: Self = this.set("bundleDependencies", js.undefined)
    
    @scala.inline
    def setContributorsVarargs(value: Person*): Self = this.set("contributors", js.Array(value :_*))
    
    @scala.inline
    def setContributors(value: js.Array[Person]): Self = this.set("contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributors: Self = this.set("contributors", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDevDependencies(value: StringDictionary[String]): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevDependencies: Self = this.set("devDependencies", js.undefined)
    
    @scala.inline
    def setEngines(value: StringDictionary[String]): Self = this.set("engines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngines: Self = this.set("engines", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    
    @scala.inline
    def setMaintainersVarargs(value: Person*): Self = this.set("maintainers", js.Array(value :_*))
    
    @scala.inline
    def setMaintainers(value: js.Array[Person]): Self = this.set("maintainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainers: Self = this.set("maintainers", js.undefined)
    
    @scala.inline
    def setManVarargs(value: String*): Self = this.set("man", js.Array(value :_*))
    
    @scala.inline
    def setMan(value: js.Array[String]): Self = this.set("man", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMan: Self = this.set("man", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptionalDependencies(value: StringDictionary[String]): Self = this.set("optionalDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalDependencies: Self = this.set("optionalDependencies", js.undefined)
    
    @scala.inline
    def setReadme(value: String): Self = this.set("readme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadme: Self = this.set("readme", js.undefined)
    
    @scala.inline
    def setRepository(value: Type): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setScripts(value: StringDictionary[String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
