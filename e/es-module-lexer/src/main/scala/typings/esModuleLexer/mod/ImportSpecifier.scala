package typings.esModuleLexer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSpecifier extends js.Object {
  /**
    * If this import statement is a dynamic import, this is the start value.
    * Otherwise this is `-1`.
    */
  var d: Double
  /**
    * End of module specifier
    */
  var e: Double
  /**
    * Start of module specifier
    * @example
    * const source = `import { a } from 'asdf'`;
    * const [imports, exports] = parse(source);
    * source.substring(imports[0].s, imports[0].e);
    * // Returns "asdf"
    */
  var s: Double
  /**
    * End of import statement
    */
  var se: Double
  /**
    * Start of import statement
    * @example
    * const source = `import { a } from 'asdf'`;
    * const [imports, exports] = parse(source);
    * source.substring(imports[0].s, imports[0].e);
    * // Returns "import { a } from 'asdf';"
    */
  var ss: Double
}

object ImportSpecifier {
  @scala.inline
  def apply(d: Double, e: Double, s: Double, se: Double, ss: Double): ImportSpecifier = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier]
  }
}

