package typings.eggDashCore.eggDashCoreMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg-core", "EggCore")
@js.native
/**
  * @constructor
  * @param {Object} options - options
  * @param {String} [options.baseDir=process.cwd()] - the directory of application
  * @param {String} [options.type=application|agent] - whether it's running in app worker or agent worker
  * @param {Object} [options.plugins] - custom plugins
  * @since 1.0.0
  */
class EggCore[Config] () extends EggCoreBase[Config] {
  def this(options: EggCoreOptions) = this()
  var Controller: Instantiable1[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Context */ /* ctx */ js.Any, 
    BaseContextClass[js.Object, js.Object, js.Object, js.Object]
  ] = js.native
  var Service: Instantiable1[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Context */ /* ctx */ js.Any, 
    BaseContextClass[js.Object, js.Object, js.Object, js.Object]
  ] = js.native
}

