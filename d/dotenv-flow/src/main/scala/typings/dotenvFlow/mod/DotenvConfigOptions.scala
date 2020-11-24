package typings.dotenvFlow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotenvConfigOptions extends js.Object {
  
  /**
    * Default node environment to use if `process.env.NODE_ENV` is not present.
    */
  var default_node_env: js.UndefOr[String] = js.native
  
  /**
    * Encoding for reading the `.env*` files.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * Node environment (development/test/production/etc,.).
    */
  var node_env: js.UndefOr[String] = js.native
  
  /**
    * Path to `.env*` files directory.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * In some cases the original "dotenv" library can be used by one of the dependent npm modules.
    * It causes calling the original `dotenv.config()` that loads the `.env` file from your project before you can call `dotenv-flow.config()`.
    *
    * Such cases breaks `.env*` files priority because the previously loaded environment variables are treated as shell-defined thus having the higher priority.
    *
    * Setting the `purge_dotenv` option to `true` can gracefully fix this issue.
    */
  var purge_dotenv: js.UndefOr[Boolean] = js.native
  
  /**
    * Suppress all console outputs except errors and deprecation warnings.
    */
  var silent: js.UndefOr[Boolean] = js.native
}
object DotenvConfigOptions {
  
  @scala.inline
  def apply(): DotenvConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvConfigOptions]
  }
  
  @scala.inline
  implicit class DotenvConfigOptionsOps[Self <: DotenvConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefault_node_env(value: String): Self = this.set("default_node_env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_node_env: Self = this.set("default_node_env", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setNode_env(value: String): Self = this.set("node_env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode_env: Self = this.set("node_env", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPurge_dotenv(value: Boolean): Self = this.set("purge_dotenv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurge_dotenv: Self = this.set("purge_dotenv", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
