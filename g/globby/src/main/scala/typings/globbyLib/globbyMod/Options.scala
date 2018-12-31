package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial<fast-glob.fast-glob/out/managers/options.IOptions<fast-glob.fast-glob/out/types/entries.EntryItem>>) */ trait Options extends js.Object {
  /**
    * If set to `true`, `globby` will automatically glob directories for you.
    * If you define an `Array` it will only glob files that matches the patterns inside the Array.
    * You can also define an `Object` with `files` and `extensions` like below:
    *
    * ```js
    * (async () => {
    *   const paths = await globby('images', {
    *     expandDirectories: {
    *       files: ['cat', 'unicorn', '*.jpg'],
    *       extensions: ['png']
    *     }
    *   });
    *   console.log(paths);
    *   //=> ['cat.png', 'unicorn.png', 'cow.jpg', 'rainbow.jpg']
    * })();
    * ```
    *
    * Note that if you set this option to `false`, you won't get back matched directories unless
    * you set `onlyFiles: false`.
    */
  var expandDirectories: js.UndefOr[globbyLib.ExpandDirectoriesOption] = js.undefined
  /**
    * Respect ignore patterns in `.gitignore` files that apply to the globbed files.
    */
  var gitignore: js.UndefOr[scala.Boolean] = js.undefined
}

