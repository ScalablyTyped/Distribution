package typings.ethersprojectHash

import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEnsNormalizeDecoderMod {
  
  @JSImport("@ethersproject/hash/lib/ens-normalize/decoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeArithmetic(bytes: Numbers): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_arithmetic")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def readCompressedPayload(bytes: Numbers): NextFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("read_compressed_payload")(bytes.asInstanceOf[js.Any]).asInstanceOf[NextFunc]
  
  inline def readEmojiTrie(next: NextFunc): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("read_emoji_trie")(next.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def readMappedMap(next: NextFunc): Record[Double, js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("read_mapped_map")(next.asInstanceOf[js.Any]).asInstanceOf[Record[Double, js.Array[Double]]]
  
  inline def readMemberArray(next: NextFunc): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("read_member_array")(next.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def readMemberArray(next: NextFunc, lookup: Record[Double, Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("read_member_array")(next.asInstanceOf[js.Any], lookup.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def readPayload(v: Numbers): NextFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("read_payload")(v.asInstanceOf[js.Any]).asInstanceOf[NextFunc]
  
  inline def readZeroTerminatedArray(next: NextFunc): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("read_zero_terminated_array")(next.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def signed(i: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("signed")(i.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait Branch extends StObject {
    
    var node: Node
    
    var set: Set[Double]
  }
  object Branch {
    
    inline def apply(node: Node, set: Set[Double]): Branch = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[Branch]
    }
    
    extension [Self <: Branch](x: Self) {
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setSet(value: Set[Double]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NextFunc extends StObject {
    
    def apply(args: Any*): Double = js.native
  }
  
  trait Node extends StObject {
    
    var branches: js.Array[Branch]
    
    var check: Boolean
    
    var fe0f: Boolean
    
    var save: Boolean
    
    var valid: Double
  }
  object Node {
    
    inline def apply(branches: js.Array[Branch], check: Boolean, fe0f: Boolean, save: Boolean, valid: Double): Node = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], check = check.asInstanceOf[js.Any], fe0f = fe0f.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setBranches(value: js.Array[Branch]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesVarargs(value: Branch*): Self = StObject.set(x, "branches", js.Array(value*))
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setFe0f(value: Boolean): Self = StObject.set(x, "fe0f", value.asInstanceOf[js.Any])
      
      inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Double): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  type Numbers = js.typedarray.Uint8Array | js.Array[Double]
}
