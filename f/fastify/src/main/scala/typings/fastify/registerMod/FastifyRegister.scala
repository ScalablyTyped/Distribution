package typings.fastify.registerMod

import typings.fastify.anon.Default
import typings.fastify.anon.DefaultFastifyPluginAsync
import typings.fastify.pluginMod.FastifyPluginAsync
import typings.fastify.pluginMod.FastifyPluginCallback
import typings.fastify.pluginMod.FastifyPluginOptions
import typings.fastify.utilsMod.RawServerDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyRegister[T] extends js.Object {
  
  def apply[Options /* <: FastifyPluginOptions */](plugin: js.Promise[Default[Options] | DefaultFastifyPluginAsync[Options]]): T = js.native
  def apply[Options /* <: FastifyPluginOptions */](
    plugin: js.Promise[Default[Options] | DefaultFastifyPluginAsync[Options]],
    opts: FastifyRegisterOptions[Options]
  ): T = js.native
  def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginAsync[Options, RawServerDefault]): T = js.native
  def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginAsync[Options, RawServerDefault], opts: FastifyRegisterOptions[Options]): T = js.native
  def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginCallback[Options, RawServerDefault]): T = js.native
  def apply[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginCallback[Options, RawServerDefault], opts: FastifyRegisterOptions[Options]): T = js.native
}
