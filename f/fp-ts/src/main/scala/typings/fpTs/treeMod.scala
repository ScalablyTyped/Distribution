package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.comonadMod.Comonad1
import typings.fpTs.eqMod.Eq
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.functorMod.Functor1
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monadMod.Monad3C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.showMod.Show
import typings.fpTs.traversableMod.PipeableTraverse1
import typings.fpTs.traversableMod.Sequence1
import typings.fpTs.traversableMod.Traversable1
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("fp-ts/lib/Tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Tree", "Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.treeMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Tree", "Comonad")
  @js.native
  val Comonad: Comonad1[typings.fpTs.treeMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Tree", "Foldable")
  @js.native
  val Foldable: Foldable1[typings.fpTs.treeMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Tree", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.treeMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Tree", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.treeMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Tree", "Traversable")
  @js.native
  val Traversable: Traversable1[typings.fpTs.treeMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Tree", "URI")
  @js.native
  val URI: /* "Tree" */ String = js.native
  type URI = /* "Tree" */ String
  
  @scala.inline
  def ap[A](fa: Tree_[A]): js.Function1[/* fab */ Tree_[js.Function1[/* a */ A, js.Any]], Tree_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Tree_[js.Function1[/* a */ A, js.Any]], Tree_[js.Any]]]
  
  @scala.inline
  def apFirst[B](fb: Tree_[B]): js.Function1[/* fa */ Tree_[js.Any], Tree_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Tree_[js.Any], Tree_[js.Any]]]
  
  @scala.inline
  def apS[A, N /* <: String */, B](name: Exclude[N, /* keyof A */ String], fb: Tree_[B]): js.Function1[
    /* fa */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSecond[B](fb: Tree_[B]): js.Function1[/* fa */ Tree_[js.Any], Tree_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Tree_[js.Any], Tree_[B]]]
  
  @scala.inline
  def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Tree_[B]]): js.Function1[
    /* fa */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Tree_[A], 
    Tree_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Tree_[js.Any], 
    Tree_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Tree_[js.Any], 
    Tree_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  @scala.inline
  def chain[A, B](f: js.Function1[/* a */ A, Tree_[B]]): js.Function1[/* ma */ Tree_[A], Tree_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Tree_[A], Tree_[B]]]
  
  @scala.inline
  def chainFirst[A, B](f: js.Function1[/* a */ A, Tree_[B]]): js.Function1[/* ma */ Tree_[A], Tree_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Tree_[A], Tree_[A]]]
  
  @scala.inline
  def drawForest(forest: Forest[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("drawForest")(forest.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def drawTree(tree: Tree_[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("drawTree")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def duplicate[A](wa: Tree_[A]): Tree_[Tree_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(wa.asInstanceOf[js.Any]).asInstanceOf[Tree_[Tree_[A]]]
  
  @scala.inline
  def elem[A](E: Eq[A]): js.Function2[/* a */ A, /* fa */ Tree_[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ A, /* fa */ Tree_[A], Boolean]]
  
  @scala.inline
  def extend[A, B](f: js.Function1[/* wa */ Tree_[A], B]): js.Function1[/* wa */ Tree_[A], Tree_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Tree_[A], Tree_[B]]]
  
  @scala.inline
  def extract[A](wa: Tree_[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(wa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def flatten[A](mma: Tree_[Tree_[A]]): Tree_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Tree_[A]]
  
  @scala.inline
  def fold[A, B](f: js.Function2[/* a */ A, /* bs */ js.Array[B], B]): js.Function1[/* tree */ Tree_[A], B] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* tree */ Tree_[A], B]]
  
  @scala.inline
  def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ js.Any, M], js.Function1[/* fa */ Tree_[js.Any], M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ js.Any, M], js.Function1[/* fa */ Tree_[js.Any], M]]]
  
  @scala.inline
  def getEq[A](E: Eq[A]): Eq[Tree_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Tree_[A]]]
  
  @scala.inline
  def getShow[A](S: Show[A]): Show[Tree_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Tree_[A]]]
  
  @scala.inline
  def make[A](value: A): Tree_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(value.asInstanceOf[js.Any]).asInstanceOf[Tree_[A]]
  @scala.inline
  def make[A](value: A, forest: Forest[A]): Tree_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(value.asInstanceOf[js.Any], forest.asInstanceOf[js.Any])).asInstanceOf[Tree_[A]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Tree_[A], Tree_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Tree_[A], Tree_[B]]]
  
  @JSImport("fp-ts/lib/Tree", "of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  @scala.inline
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ Tree_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Tree_[A], B]]
  
  @scala.inline
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ Tree_[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Tree_[A], B]]
  
  @JSImport("fp-ts/lib/Tree", "sequence")
  @js.native
  val sequence: Sequence1[typings.fpTs.treeMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Tree", "traverse")
  @js.native
  val traverse: PipeableTraverse1[typings.fpTs.treeMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Tree", "tree")
  @js.native
  val tree: Monad1[typings.fpTs.treeMod.URI] & Foldable1[typings.fpTs.treeMod.URI] & Traversable1[typings.fpTs.treeMod.URI] & Comonad1[typings.fpTs.treeMod.URI] = js.native
  
  @scala.inline
  def unfoldForest[A, B](bs: js.Array[B], f: js.Function1[/* b */ B, js.Tuple2[A, js.Array[B]]]): Forest[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForest")(bs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Forest[A]]
  
  @scala.inline
  def unfoldForestM[M](M: typings.fpTs.monadMod.Monad[M]): js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Forest<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Forest<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Forest<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Forest<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, [E, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Forest<E>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, [E, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Forest<E>> */ js.Any
  ]]
  @scala.inline
  def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](M: Monad3[M]): js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Forest<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Forest<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Forest<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Forest<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldForestM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](M: Monad3C[M, E]): js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Forest<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldForestM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* bs */ js.Array[js.Any], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Forest<A>> */ js.Any
  ]]
  
  @scala.inline
  def unfoldTree[A, B](b: B, f: js.Function1[/* b */ B, js.Tuple2[A, js.Array[B]]]): Tree_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTree")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Tree_[A]]
  
  @scala.inline
  def unfoldTreeM[M](M: typings.fpTs.monadMod.Monad[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Tree<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Tree<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Tree<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Tree<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Tree<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Tree<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](M: Monad3[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Tree<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Tree<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Tree<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Tree<A>> */ js.Any
  ]]
  @scala.inline
  def unfoldTreeM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](M: Monad3C[M, E]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Tree<A>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldTreeM")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, [A, Array<B>]> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, Tree<A>> */ js.Any
  ]]
  
  type Forest[A] = js.Array[Tree_[A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  trait Tree_[A] extends StObject {
    
    val forest: Forest[A]
    
    val value: A
  }
  object Tree_ {
    
    @scala.inline
    def apply[A](forest: Forest[A], value: A): Tree_[A] = {
      val __obj = js.Dynamic.literal(forest = forest.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tree_[A]]
    }
    
    @scala.inline
    implicit class Tree_MutableBuilder[Self <: Tree_[?], A] (val x: Self & Tree_[A]) extends AnyVal {
      
      @scala.inline
      def setForest(value: Forest[A]): Self = StObject.set(x, "forest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForestVarargs(value: Tree_[A]*): Self = StObject.set(x, "forest", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: A): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
