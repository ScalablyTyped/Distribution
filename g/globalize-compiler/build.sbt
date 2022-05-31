organization := "org.scalablytyped"
name := "globalize-compiler"
version := "v0.2.0-dt-20201002Z-701e45"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20200923Z-f7e1cc",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20201002Z-a71e63",
  "org.scalablytyped" %%% "globalize" % "1.5-dt-20201002Z-bd72c3",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
