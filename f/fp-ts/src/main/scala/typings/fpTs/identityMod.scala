package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt1
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.chainRecMod.ChainRec1
import typings.fpTs.comonadMod.Comonad1
import typings.fpTs.eqMod.Eq
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.functorMod.Functor1
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.showMod.Show
import typings.fpTs.traversableMod.PipeableTraverse1
import typings.fpTs.traversableMod.Sequence1
import typings.fpTs.traversableMod.Traversable1
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityMod {
  
  @JSImport("fp-ts/lib/Identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Identity", "Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "ChainRec")
  @js.native
  val ChainRec: ChainRec1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "Comonad")
  @js.native
  val Comonad: Comonad1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "URI")
  @js.native
  val URI: /* "Identity" */ String = js.native
  type URI = /* "Identity" */ String
  
  inline def alt[A](that: js.Function0[Identity_[A]]): js.Function1[/* fa */ Identity_[A], Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Identity_[A], Identity_[A]]]
  
  inline def ap[A](fa: Identity_[A]): js.Function1[/* fab */ Identity_[js.Function1[/* a */ A, js.Any]], Identity_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Identity_[js.Function1[/* a */ A, js.Any]], Identity_[js.Any]]]
  
  inline def apFirst[B](fb: Identity_[B]): js.Function1[/* fa */ Identity_[js.Any], Identity_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Identity_[js.Any], Identity_[js.Any]]]
  
  inline def apS[A, N /* <: String */, B](name: Exclude[N, /* keyof A */ String], fb: B): js.Function1[
    /* fa */ A, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ A, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
  ]]
  
  inline def apSecond[B](fb: B): js.Function1[/* fa */ js.Any, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ js.Any, B]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ A, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ A, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, Identity_[B]]): js.Function1[/* ma */ Identity_[A], Identity_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Identity_[A], Identity_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, Identity_[B]]): js.Function1[/* ma */ Identity_[A], Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Identity_[A], Identity_[A]]]
  
  inline def duplicate[A](ma: Identity_[A]): Identity_[Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(ma.asInstanceOf[js.Any]).asInstanceOf[Identity_[Identity_[A]]]
  
  inline def extend[A, B](f: js.Function1[/* wa */ Identity_[A], B]): js.Function1[/* wa */ Identity_[A], Identity_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Identity_[A], Identity_[B]]]
  
  inline def extract[A](wa: Identity_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(wa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def flatten[A](mma: Identity_[Identity_[A]]): Identity_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Identity_[A]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ Identity_[js.Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ Identity_[js.Any], M]
  ]]
  
  inline def getEq[A](E: Eq[A]): Eq[Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Identity_[A]]]
  
  inline def getShow[A](S: Show[A]): Show[Identity_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Identity_[A]]]
  
  @JSImport("fp-ts/lib/Identity", "identity")
  @js.native
  val identity: Monad1[typings.fpTs.identityMod.URI] & Foldable1[typings.fpTs.identityMod.URI] & Traversable1[typings.fpTs.identityMod.URI] & Alt1[typings.fpTs.identityMod.URI] & Comonad1[typings.fpTs.identityMod.URI] & ChainRec1[typings.fpTs.identityMod.URI] = js.native
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Identity_[A], Identity_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Identity_[A], Identity_[B]]]
  
  @JSImport("fp-ts/lib/Identity", "of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Identity_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Identity_[A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Identity_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Identity_[A], B]]
  
  @JSImport("fp-ts/lib/Identity", "sequence")
  @js.native
  val sequence: Sequence1[typings.fpTs.identityMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Identity", "traverse")
  @js.native
  val traverse: PipeableTraverse1[typings.fpTs.identityMod.URI] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type Identity_[A] = A
}
