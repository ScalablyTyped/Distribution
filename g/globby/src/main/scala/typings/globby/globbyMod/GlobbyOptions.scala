package typings.globby.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof fast-glob.fast-glob/out/managers/options.IOptions<fast-glob.fast-glob/out/types/entries.EntryItem> ]:? fast-glob.fast-glob/out/managers/options.IOptions<fast-glob.fast-glob/out/types/entries.EntryItem>[P]} */ trait GlobbyOptions extends js.Object {
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
  val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.undefined
  /**
  		Respect ignore patterns in `.gitignore` files that apply to the globbed files.
  		@default false
  		*/
  val gitignore: js.UndefOr[Boolean] = js.undefined
}

object GlobbyOptions {
  @scala.inline
  def apply(expandDirectories: ExpandDirectoriesOption = null, gitignore: js.UndefOr[Boolean] = js.undefined): GlobbyOptions = {
    val __obj = js.Dynamic.literal()
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobbyOptions]
  }
}

