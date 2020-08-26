package typings.globby.mod

import typings.fastGlob.settingsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobbyOptions extends Options {
  /**
  		If set to `true`, `globby` will automatically glob directories for you. If you define an `Array` it will only glob files that matches the patterns inside the `Array`. You can also define an `Object` with `files` and `extensions` like in the example below.
  		Note that if you set this option to `false`, you won't get back matched directories unless you set `onlyFiles: false`.
  		@default true
  		@example
  		```
  		import globby = require('globby');
  		(async () => {
  			const paths = await globby('images', {
  				expandDirectories: {
  					files: ['cat', 'unicorn', '*.jpg'],
  					extensions: ['png']
  				}
  			});
  			console.log(paths);
  			//=> ['cat.png', 'unicorn.png', 'cow.jpg', 'rainbow.jpg']
  		})();
  		```
  		*/
  val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.native
  /**
  		Respect ignore patterns in `.gitignore` files that apply to the globbed files.
  		@default false
  		*/
  val gitignore: js.UndefOr[Boolean] = js.native
}

object GlobbyOptions {
  @scala.inline
  def apply(): GlobbyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobbyOptions]
  }
  @scala.inline
  implicit class GlobbyOptionsOps[Self <: GlobbyOptions] (val x: Self) extends AnyVal {
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
    def setExpandDirectoriesVarargs(value: String*): Self = this.set("expandDirectories", js.Array(value :_*))
    @scala.inline
    def setExpandDirectories(value: ExpandDirectoriesOption): Self = this.set("expandDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandDirectories: Self = this.set("expandDirectories", js.undefined)
    @scala.inline
    def setGitignore(value: Boolean): Self = this.set("gitignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitignore: Self = this.set("gitignore", js.undefined)
  }
  
}

