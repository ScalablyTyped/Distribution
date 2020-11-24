package typings.ganacheCore.mod

import typings.ganacheCore.mod.Ganache.IProviderOptions
import typings.ganacheCore.mod.Ganache.IServerOptions
import typings.ganacheCore.mod.Ganache.Provider
import typings.ganacheCore.mod.Ganache.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ganache-core", JSImport.Default)
@js.native
object default extends js.Object {
  
  def provider(): Provider = js.native
  def provider(opts: IProviderOptions): Provider = js.native
  
  def server(): Server = js.native
  def server(opts: IServerOptions): Server = js.native
}
