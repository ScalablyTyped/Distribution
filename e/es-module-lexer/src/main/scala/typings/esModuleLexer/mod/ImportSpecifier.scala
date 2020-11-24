package typings.esModuleLexer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifier extends js.Object {
  
  /**
    * If this import statement is a dynamic import, this is the start value.
    * Otherwise this is `-1`.
    */
  var d: Double = js.native
  
  /**
    * End of module specifier
    */
  var e: Double = js.native
  
  /**
    * Start of module specifier
    * @example
    * const source = `import { a } from 'asdf'`;
    * const [imports, exports] = parse(source);
    * source.substring(imports[0].s, imports[0].e);
    * // Returns "asdf"
    */
  var s: Double = js.native
  
  /**
    * End of import statement
    */
  var se: Double = js.native
  
  /**
    * Start of import statement
    * @example
    * const source = `import { a } from 'asdf'`;
    * const [imports, exports] = parse(source);
    * source.substring(imports[0].s, imports[0].e);
    * // Returns "import { a } from 'asdf';"
    */
  var ss: Double = js.native
}
object ImportSpecifier {
  
  @scala.inline
  def apply(d: Double, e: Double, s: Double, se: Double, ss: Double): ImportSpecifier = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier]
  }
  
  @scala.inline
  implicit class ImportSpecifierOps[Self <: ImportSpecifier] (val x: Self) extends AnyVal {
    
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
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSe(value: Double): Self = this.set("se", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSs(value: Double): Self = this.set("ss", value.asInstanceOf[js.Any])
  }
}
