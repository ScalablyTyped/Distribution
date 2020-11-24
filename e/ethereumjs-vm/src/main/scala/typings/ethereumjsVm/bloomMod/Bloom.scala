package typings.ethereumjsVm.bloomMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bloom extends js.Object {
  
  /**
    * Adds an element to a bit vector of a 64 byte bloom filter.
    * @param e - The element to add
    */
  def add(e: Buffer): Unit = js.native
  
  var bitvector: Buffer = js.native
  
  /**
    * Checks if an element is in the bloom.
    * @param e - The element to check
    */
  def check(e: Buffer): Boolean = js.native
  
  /**
    * Checks if multiple topics are in a bloom.
    * @returns `true` if every topic is in the bloom
    */
  def multiCheck(topics: js.Array[Buffer]): Boolean = js.native
  
  /**
    * Bitwise or blooms together.
    */
  def or(bloom: Bloom): Unit = js.native
}
object Bloom {
  
  @scala.inline
  def apply(
    add: Buffer => Unit,
    bitvector: Buffer,
    check: Buffer => Boolean,
    multiCheck: js.Array[Buffer] => Boolean,
    or: Bloom => Unit
  ): Bloom = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), bitvector = bitvector.asInstanceOf[js.Any], check = js.Any.fromFunction1(check), multiCheck = js.Any.fromFunction1(multiCheck), or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[Bloom]
  }
  
  @scala.inline
  implicit class BloomOps[Self <: Bloom] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Buffer => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBitvector(value: Buffer): Self = this.set("bitvector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck(value: Buffer => Boolean): Self = this.set("check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiCheck(value: js.Array[Buffer] => Boolean): Self = this.set("multiCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOr(value: Bloom => Unit): Self = this.set("or", js.Any.fromFunction1(value))
  }
}
