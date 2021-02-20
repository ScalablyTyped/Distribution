package typings.findPackageJson

import org.scalablytyped.runtime.StringDictionary
import typings.findPackageJson.anon.Email
import typings.findPackageJson.anon.Type
import typings.findPackageJson.anon.Url
import typings.findPackageJson.findPackageJsonBooleans.`false`
import typings.findPackageJson.findPackageJsonBooleans.`true`
import typings.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-package-json", JSImport.Namespace)
  @js.native
  def apply(): FinderIterator = js.native
  @JSImport("find-package-json", JSImport.Namespace)
  @js.native
  def apply(root: String): FinderIterator = js.native
  @JSImport("find-package-json", JSImport.Namespace)
  @js.native
  def apply(root: NodeModule): FinderIterator = js.native
  
  @js.native
  trait Done extends FindResult {
    
    var done: `true` = js.native
    
    var filename: js.UndefOr[scala.Nothing] = js.native
    
    var value: js.UndefOr[scala.Nothing] = js.native
  }
  object Done {
    
    @scala.inline
    def apply(done: `true`): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.findPackageJson.mod.FoundPackage
    - typings.findPackageJson.mod.Done
  */
  trait FindResult extends StObject
  object FindResult {
    
    @scala.inline
    def Done(done: `true`): typings.findPackageJson.mod.Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.findPackageJson.mod.Done]
    }
    
    @scala.inline
    def FoundPackage(done: `false`, filename: String, value: Package): typings.findPackageJson.mod.FoundPackage = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.findPackageJson.mod.FoundPackage]
    }
  }
  
  @js.native
  trait FinderIterator extends StObject {
    
    def next(): FindResult = js.native
  }
  object FinderIterator {
    
    @scala.inline
    def apply(next: () => FindResult): FinderIterator = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[FinderIterator]
    }
    
    @scala.inline
    implicit class FinderIteratorMutableBuilder[Self <: FinderIterator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => FindResult): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FoundPackage extends FindResult {
    
    var done: `false` = js.native
    
    var filename: String = js.native
    
    var value: Package = js.native
  }
  object FoundPackage {
    
    @scala.inline
    def apply(done: `false`, filename: String, value: Package): FoundPackage = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FoundPackage]
    }
    
    @scala.inline
    implicit class FoundPackageMutableBuilder[Self <: FoundPackage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Package): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setBin(value: StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      @scala.inline
      def setBugs(value: Email | Url): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      @scala.inline
      def setBundleDependencies(value: StringDictionary[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      @scala.inline
      def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      @scala.inline
      def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value :_*))
      
      @scala.inline
      def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setEngines(value: StringDictionary[String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      @scala.inline
      def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      @scala.inline
      def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      @scala.inline
      def setMan(value: js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      @scala.inline
      def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionalDependencies(value: StringDictionary[String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      @scala.inline
      def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      @scala.inline
      def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setScripts(value: StringDictionary[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Person extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Person {
    
    @scala.inline
    def apply(): Person = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Person]
    }
    
    @scala.inline
    implicit class PersonMutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
