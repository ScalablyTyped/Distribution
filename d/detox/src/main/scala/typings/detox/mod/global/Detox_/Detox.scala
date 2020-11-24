package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detox extends js.Object {
  
  /**
    * Artifacts currently include only logs from the app process after each task
    * @param args
    */
  def afterEach(args: js.Any*): js.Promise[Unit] = js.native
  
  /**
    * Artifacts currently include only logs from the app process before each task
    * @param args
    */
  def beforeEach(args: js.Any*): js.Promise[Unit] = js.native
  
  /**
    * The cleanup phase should happen after all the tests have finished. This is the phase where detox-server shuts down.
    * @example after(async () => {
    *  await detox.cleanup();
    * });
    */
  def cleanup(): js.Promise[Unit] = js.native
  
  /**
    * The setup phase happens inside detox.init(). This is the phase where detox reads its configuration, starts a server, loads its expection library and starts a simulator
    * @param config
    * @param options
    * @example const config = require('../package.json').detox;
    *
    * before(async () => {
    *      await detox.init(config);
    * });
    */
  def init(config: js.Any): js.Promise[Unit] = js.native
  def init(config: js.Any, options: DetoxInitOptions): js.Promise[Unit] = js.native
}
