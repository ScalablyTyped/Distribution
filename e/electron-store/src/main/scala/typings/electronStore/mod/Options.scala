package typings.electronStore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.conf.mod.Conf
import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined type-fest.type-fest.Except<conf.conf.Options<T>, 'configName' | 'projectName' | 'projectVersion' | 'projectSuffix'> & { readonly name ? :string} */
trait Options[T] extends js.Object {
  var accessPropertiesByDotNotation: js.UndefOr[Boolean] = js.undefined
  var clearInvalidConfig: js.UndefOr[Boolean] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var defaults: js.UndefOr[T] = js.undefined
  var deserialize: js.UndefOr[js.Function1[/* text */ String, T]] = js.undefined
  var encryptionKey: js.UndefOr[String | Buffer | TypedArray | DataView] = js.undefined
  var fileExtension: js.UndefOr[String] = js.undefined
  var migrations: js.UndefOr[StringDictionary[js.Function1[/* store */ Conf[T], Unit]]] = js.undefined
  /**
  		Name of the storage file (without extension).
  		This is useful if you want multiple storage files for your app. Or if you're making a reusable Electron module that persists some data, in which case you should **not** use the name `config`.
  		@default 'config'
  		*/
  val name: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: conf.conf.Schema}
    */ typings.electronStore.electronStoreStrings.Options with TopLevel[js.Any]
  ] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* value */ T, String]] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    accessPropertiesByDotNotation: js.UndefOr[Boolean] = js.undefined,
    clearInvalidConfig: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    defaults: T = null,
    deserialize: /* text */ String => T = null,
    encryptionKey: String | Buffer | TypedArray | DataView = null,
    fileExtension: String = null,
    migrations: StringDictionary[js.Function1[/* store */ Conf[T], Unit]] = null,
    name: String = null,
    schema: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: conf.conf.Schema}
    */ typings.electronStore.electronStoreStrings.Options with TopLevel[js.Any] = null,
    serialize: /* value */ T => String = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessPropertiesByDotNotation)) __obj.updateDynamic("accessPropertiesByDotNotation")(accessPropertiesByDotNotation.asInstanceOf[js.Any])
    if (!js.isUndefined(clearInvalidConfig)) __obj.updateDynamic("clearInvalidConfig")(clearInvalidConfig.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1(deserialize))
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension.asInstanceOf[js.Any])
    if (migrations != null) __obj.updateDynamic("migrations")(migrations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

