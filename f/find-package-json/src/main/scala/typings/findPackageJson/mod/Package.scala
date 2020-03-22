package typings.findPackageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.findPackageJson.AnonEmail
import typings.findPackageJson.AnonType
import typings.findPackageJson.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package
  extends /* k */ StringDictionary[js.Any] {
  var author: js.UndefOr[Person] = js.undefined
  var bin: js.UndefOr[StringDictionary[String]] = js.undefined
  var bugs: js.UndefOr[AnonEmail | AnonUrl] = js.undefined
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
  var repository: js.UndefOr[AnonType] = js.undefined
  var scripts: js.UndefOr[StringDictionary[String]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Package {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    author: Person = null,
    bin: StringDictionary[String] = null,
    bugs: AnonEmail | AnonUrl = null,
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
    repository: AnonType = null,
    scripts: StringDictionary[String] = null,
    version: String = null
  ): Package = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (bugs != null) __obj.updateDynamic("bugs")(bugs.asInstanceOf[js.Any])
    if (bundleDependencies != null) __obj.updateDynamic("bundleDependencies")(bundleDependencies.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (man != null) __obj.updateDynamic("man")(man.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optionalDependencies != null) __obj.updateDynamic("optionalDependencies")(optionalDependencies.asInstanceOf[js.Any])
    if (readme != null) __obj.updateDynamic("readme")(readme.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}

