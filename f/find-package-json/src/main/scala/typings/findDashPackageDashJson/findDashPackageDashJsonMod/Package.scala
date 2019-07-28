package typings.findDashPackageDashJson.findDashPackageDashJsonMod

import org.scalablytyped.runtime.StringDictionary
import typings.findDashPackageDashJson.Anon_Email
import typings.findDashPackageDashJson.Anon_EmailUrl
import typings.findDashPackageDashJson.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package
  extends /* k */ StringDictionary[js.Any] {
  var author: js.UndefOr[Person] = js.undefined
  var bin: js.UndefOr[StringDictionary[String]] = js.undefined
  var bugs: js.UndefOr[Anon_Email | Anon_EmailUrl] = js.undefined
  var bundleDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var contributors: js.UndefOr[js.Array[Person]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var devDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var engines: js.UndefOr[StringDictionary[String]] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
  var homepage: js.UndefOr[String] = js.undefined
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var license: js.UndefOr[String] = js.undefined
  var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
  var man: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var optionalDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var readme: js.UndefOr[String] = js.undefined
  var repository: js.UndefOr[Anon_Type] = js.undefined
  var scripts: js.UndefOr[StringDictionary[String]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Package {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    author: Person = null,
    bin: StringDictionary[String] = null,
    bugs: Anon_Email | Anon_EmailUrl = null,
    bundleDependencies: StringDictionary[String] = null,
    contributors: js.Array[Person] = null,
    dependencies: StringDictionary[String] = null,
    description: String = null,
    devDependencies: StringDictionary[String] = null,
    engines: StringDictionary[String] = null,
    files: js.Array[String] = null,
    homepage: String = null,
    keywords: js.Array[String] = null,
    license: String = null,
    maintainers: js.Array[Person] = null,
    man: js.Array[String] = null,
    name: String = null,
    optionalDependencies: StringDictionary[String] = null,
    readme: String = null,
    repository: Anon_Type = null,
    scripts: StringDictionary[String] = null,
    version: String = null
  ): Package = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies)
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (engines != null) __obj.updateDynamic("engines")(engines)
    if (files != null) __obj.updateDynamic("files")(files)
    if (homepage != null) __obj.updateDynamic("homepage")(homepage)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (license != null) __obj.updateDynamic("license")(license)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (man != null) __obj.updateDynamic("man")(man)
    if (name != null) __obj.updateDynamic("name")(name)
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies)
    if (readme != null) __obj.updateDynamic("readme")(readme)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Package]
  }
}

