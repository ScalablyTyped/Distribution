package typings.getRange.mod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("get-range", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Lazy number range generator.
  @example
  ```
  import getRange = require('get-range');
  for (const index of getRange({end: 4})) {
  	console.log(index);
  }
  //=> 0
  //=> 1
  //=> 2
  //=> 3
  const range = getRange({start: 0, end: 4, step: 2});
  range.next().value;
  //=> 0
  range.next().value;
  //=> 2
  console.log(...getRange({start: 0, end: -5, step: -1}));
  //=> [0, -1, -2, -3, -4]
  ```
  */
  def apply(range: Range): IterableIterator[Double] = js.native
}

