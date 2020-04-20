package typings.eggCore.mod

import typings.eggCore.AnonExports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileLoaderBase extends js.Object {
  /**
    * attach items to target object. Mapping the directory to properties.
    * `app/controller/group/repository.js` => `target.group.repository`
    * @return {Object} target
    * @since 1.0.0
    */
  def load(): js.Object
  /**
    * Parse files from given directories, then return an items list, each item contains properties and exports.
    *
    * For example, parse `app/controller/group/repository.js`
    *
    * ```js
    * module.exports = app => {
    *   return class RepositoryController extends app.Controller {};
    * }
    * ```
    *
    * It returns a item
    *
    * ```js
    * {
    *   properties: [ 'group', 'repository' ],
    *   exports: app => { ... },
    * }
    * ```
    *
    * `Properties` is an array that contains the directory of a filepath.
    *
    * `Exports` depends on type, if exports is a function, it will be called. if initializer is specified, it will be called with exports for customizing.
    * @return {Array} items
    * @since 1.0.0
    */
  def parse(): js.Array[AnonExports]
}

object FileLoaderBase {
  @scala.inline
  def apply(load: () => js.Object, parse: () => js.Array[AnonExports]): FileLoaderBase = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load), parse = js.Any.fromFunction0(parse))
    __obj.asInstanceOf[FileLoaderBase]
  }
}

