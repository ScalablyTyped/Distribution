package typings
package getDashUrlsLib.getDashUrlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("get-urls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Get all URLs in a string.
  The URLs will be [normalized](https://github.com/sindresorhus/normalize-url).
  @returns A `Set` of URLs.
  @example
  ```
  import getUrls = require('get-urls');
  const text = 'Lorem ipsum dolor sit amet, //sindresorhus.com consectetuer adipiscing http://yeoman.io elit.';
  getUrls(text);
  //=> Set {'http://sindresorhus.com', 'http://yeoman.io'}
  ```
  */
  def apply(text: java.lang.String): stdLib.Set[java.lang.String] = js.native
  def apply(text: java.lang.String, options: Options): stdLib.Set[java.lang.String] = js.native
}

