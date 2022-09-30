organization := "org.scalablytyped"
name := "firebase__app-check-compat"
version := "0.2.12-a1b6df"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-ce1791",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.12-4812d7",
  "org.scalablytyped" %%% "firebase__app-check-types" % "0.4.0-a24001",
  "org.scalablytyped" %%% "firebase__app-compat" % "0.1.34-8185a7",
  "org.scalablytyped" %%% "firebase__app-types" % "0.7.0-c681f7",
  "org.scalablytyped" %%% "firebase__component" % "0.5.17-85ef60",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-a02e57",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-f102dd",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
