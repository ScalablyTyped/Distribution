package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageJson extends js.Object {
  var author: js.UndefOr[java.lang.String | gatsbyLib.Anon_Email] = js.undefined
  var bundledDependecies: js.UndefOr[js.Array[stdLib.Record[java.lang.String, java.lang.String]]] = js.undefined
  var dependencies: js.UndefOr[js.Array[stdLib.Record[java.lang.String, java.lang.String]]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var devDependencies: js.UndefOr[js.Array[stdLib.Record[java.lang.String, java.lang.String]]] = js.undefined
  var keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var license: js.UndefOr[java.lang.String] = js.undefined
  var main: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var optionalDependecies: js.UndefOr[js.Array[stdLib.Record[java.lang.String, java.lang.String]]] = js.undefined
  var peerDependencies: js.UndefOr[js.Array[stdLib.Record[java.lang.String, java.lang.String]]] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object PackageJson {
  @scala.inline
  def apply(
    author: java.lang.String | gatsbyLib.Anon_Email = null,
    bundledDependecies: js.Array[stdLib.Record[java.lang.String, java.lang.String]] = null,
    dependencies: js.Array[stdLib.Record[java.lang.String, java.lang.String]] = null,
    description: java.lang.String = null,
    devDependencies: js.Array[stdLib.Record[java.lang.String, java.lang.String]] = null,
    keywords: js.Array[java.lang.String] = null,
    license: java.lang.String = null,
    main: java.lang.String = null,
    name: java.lang.String = null,
    optionalDependecies: js.Array[stdLib.Record[java.lang.String, java.lang.String]] = null,
    peerDependencies: js.Array[stdLib.Record[java.lang.String, java.lang.String]] = null,
    version: java.lang.String = null
  ): PackageJson = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (bundledDependecies != null) __obj.updateDynamic("bundledDependecies")(bundledDependecies)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (license != null) __obj.updateDynamic("license")(license)
    if (main != null) __obj.updateDynamic("main")(main)
    if (name != null) __obj.updateDynamic("name")(name)
    if (optionalDependecies != null) __obj.updateDynamic("optionalDependecies")(optionalDependecies)
    if (peerDependencies != null) __obj.updateDynamic("peerDependencies")(peerDependencies)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PackageJson]
  }
}

